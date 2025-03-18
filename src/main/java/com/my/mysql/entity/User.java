package com.my.mysql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String passwd;

    public void updateUser(String name, String passwd) {
        if (name != null) {
            this.name = name;
        }
        if (passwd != null) {
            this.passwd = passwd;
        }
    }
}