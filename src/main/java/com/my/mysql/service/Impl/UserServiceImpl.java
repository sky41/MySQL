package com.my.mysql.service.Impl;

import com.my.mysql.entity.User;
import com.my.mysql.mapper.UserMapper;
import com.my.mysql.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public User queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public String addUser(User user) {
        try {
            userMapper.addUser(user);
            logger.info("新增用户成功，用户ID: {}", user.getId());
            return "新增成功";
        } catch (Exception e) {
            logger.error("新增用户失败，用户信息: {}", user, e);
            return "新增失败";
        }
    }

    @Override
    public String deleteUserById(int id) {
        try {
            userMapper.deleteUserById(id);
            logger.info("删除用户成功，用户ID: {}", id);
            return "删除成功";
        } catch (Exception e) {
            logger.error("删除用户失败，用户ID: {}", id, e);
            return "删除失败";
        }
    }

    @Override
    public String updateUser(User user) {
        if (user == null) {
            return "用户信息为空，更新失败";
        }
        try {
            userMapper.updateUser(user);
            logger.info("更新用户信息成功，用户ID: {}", user.getId());
            return "更新成功";
        } catch (Exception e) {
            logger.error("更新用户信息失败，用户信息: {}", user, e);
            return "更新失败";
        }
    }

    @Override
    public User login(String name, String passwd) {
        return userMapper.login(name, passwd);
    }

    @Override
    public String register(User newUser) {
        if (userMapper.checkUserExists(newUser.getName()) > 0) {
            return "用户已存在";
        }
        try {
            userMapper.insertUser(newUser);
            logger.info("用户注册成功，用户ID: {}", newUser.getId());
            return "注册成功";
        } catch (Exception e) {
            logger.error("用户注册失败，用户信息: {}", newUser, e);
            return "注册失败";
        }
    }
}