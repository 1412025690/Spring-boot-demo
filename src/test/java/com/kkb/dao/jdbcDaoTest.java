package com.kkb.dao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class jdbcDaoTest {
    @Autowired
    private JdbcDao jdbcDao;

    @Test
    public void test01(){
        jdbcDao.findAll().forEach(user -> System.out.println(user));
    }
}