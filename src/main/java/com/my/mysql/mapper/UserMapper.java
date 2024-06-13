package com.my.mysql.mapper;

import com.my.mysql.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserList();
    User queryUserById(int id);
    void addUser(User user);
    void deleteUserById(int id);
    void updateUser(User user);

}


