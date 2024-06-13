package com.my.mysql.service;

import com.my.mysql.entity.User;

import java.util.List;

public interface UserService {

    List<User> queryUserList();

    User queryUserById(int id);

    String addUser(User user);

    String deleteUserById(int id);

    String updateUser(User user);
}