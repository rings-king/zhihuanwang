package com.lanou.service;

import com.lanou.model.User;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface Userservice {
    public abstract int insert(User user);
    public List<User> selectAll();
}
