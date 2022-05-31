package com.kkb.dao;

import com.kkb.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {
    public List<User> findAll();

}
