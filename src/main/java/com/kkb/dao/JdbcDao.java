package com.kkb.dao;


import com.kkb.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //控制反转
public class JdbcDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> findAll(){
        //  BeanPropertyRowMapper : 可以将同名字段赋值给属性
        return jdbcTemplate.query("select * from tb_user",new BeanPropertyRowMapper<>(User.class));
    }
}
