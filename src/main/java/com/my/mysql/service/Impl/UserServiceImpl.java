package com.my.mysql.service.Impl;

import com.my.mysql.controller.UserController;
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
    @Autowired
    private UserController userController;

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
//    @Override
//    public User login(String name, String passwd) {
//        // 根据用户名在数据库中查询用户信息
//        userMapper.login();
//
//        if (user != null && user.getPasswd().equals(passwd)) {
//            return user; // 返回用户信息表示登录成功
//        } else {
//            return null; // 返回null表示登录失败
//        }
//    }
//    public String register(User newUser) {
//        // 检查用户是否已经存在
//        userMapper.register(newUser);
//        if (userExists(newUser.getUsername())) {
//            return "User already exists"; // 返回用户已存在的信息
//        } else {
//            // 在这里执行注册逻辑，向数据库中添加新用户
//            addUser(newUser);
//            return "Registration successful"; // 返回注册成功信息
//        }
//    }
}
