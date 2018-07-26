package com.lanou.service.impl;

import com.lanou.dao.UserMapper;
import com.lanou.model.User;
import com.lanou.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements Userservice {
    @Autowired
    private UserMapper userMapper;

    public int insert(User user) {
        int i = userMapper.insert(user);
        return i;
    }
    public List<User> selectAll(){
       List<User> users = userMapper.selectAll();
        return users;
    }
}
