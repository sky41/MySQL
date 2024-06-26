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
//    User login(String name, String passwd);
//
//    String register(User newUser);
//修改1.0.0备份
//package com.my.mysql.service;
//
//import com.my.mysql.entity.User;
//import com.my.mysql.mapper.UserMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.List;
//
//@Service
//public class UserService {
//    @Autowired
//
//    public List<User> queryUserList(){
//        return userMapper.queryUserList();
//
//    }
//    public User queryUserById(int id){
//        User user= userMapper.queryUserById(id);
//        return user;
//
//    }
//    public String addUser(User user){
//        userMapper.addUser(user);
//        return "新增成功";
//
//    }
//    public String deleteUserById(int id){
//        userMapper.deleteUserById(id);
//        return "删除成功";
//    }
////    public void updateUser(User user) {
////        if (user != null) {
////            userMapper.updateUser(user);
////            return "修改成功";
////        } else {
////            return "用户信息为空，修改失败";
////        }
////    }
////    public void updateUser(User user) {
////        userMapper.updateUser(user);
////        System.out.println("更新成功");
////    }
////    @PutMapping("/updateUser")
////    public String updateUser(@RequestBody User user) {
////        userMapper.updateUser(user);
////        return "更新成功";
////    }
//public String updateUser(User user) {
//    if (user != null) {
//        userMapper.updateUser(user);
//        return "更新成功";
//    } else {
//        return "用户信息为空，更新失败";
//    }
//}
//}
//
//如果把UserService分出来impl实现类，怎么写