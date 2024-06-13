package com.my.mysql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String passwd;

    public User(int id, String name, String passwd) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
    }

    public void updateUser(String name, String passwd) {
        if (name != null) {
            this.name = name;
        }
        if (passwd != null) {
            this.passwd = passwd;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public static void main(String[] args) {
        User user = new User(123, "Alice", "30");

        System.out.println("Before update:");
        System.out.println("Name: " + user.getName());
        System.out.println("Passwd: " + user.getPasswd());

        user.updateUser(null, "newPassword");

        System.out.println("\nAfter update:");
        System.out.println("Name: " + user.getName());
        System.out.println("Passwd: " + user.getPasswd());
    }
}