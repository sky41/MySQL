package com.my.mysql.service.Impl;

import com.my.mysql.entity.User;
import com.my.mysql.mapper.UserMapper;
import com.my.mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

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
        userMapper.addUser(user);
        return "新增成功";
    }

    @Override
    public String deleteUserById(int id) {
        userMapper.deleteUserById(id);
        return "删除成功";
    }

    @Override
    public String updateUser(User user) {
        if (user != null) {
            userMapper.updateUser(user);
            return "更新成功";
        } else {
            return "用户信息为空，更新失败";
        }
    }
}
