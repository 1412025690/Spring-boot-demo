package com.kkb.dao;

import com.kkb.domain.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {

    public List<User> findByUser(User user);
}
