package com.my.mysql.controller;

import com.my.mysql.entity.User;
import com.my.mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        return userService.queryUserList();

    }
    @GetMapping ("/queryUserById")
    public User queryUserById(int id){
        return userService.queryUserById(id);

    }

    @GetMapping("/addUser")
    public String addUser(User user){
        return userService.addUser(user);

    }

    @GetMapping("/deleteUserById")
    public String deleteUserById(int id){
        return userService.deleteUserById(id);

    }
//    @PutMapping("/updateUser")
//    public String updateUser(@RequestBody User user) {
//        userService.updateUser(user);
//        System.out.println("更新成功");
//        return "更新成功";
//    }
    @PutMapping("/updateUser")
    public String updateUser(@RequestBody User user) {
        return userService.updateUser(user);
}
//    @PostMapping("/login")
//    public String login(@RequestBody User user) {
//        return userService.login(String name,String passwd);
//    }
//    @PostMapping("/register")
//    public String register(@RequestBody User user) {
//        return userService.register(user);
//    }

}

