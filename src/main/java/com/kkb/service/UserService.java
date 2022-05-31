package com.kkb.service;

import com.kkb.dao.UserMapper;
import com.kkb.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.selectAll();
    }
}
