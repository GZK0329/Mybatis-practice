package com.gzk.dao;

import com.gzk.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    void addUser(User user);
    int updateUserById(User user);
    int deleteUserById(int i);

}
