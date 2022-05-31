package com.kkb.dao;

import com.kkb.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class UserMapperTest {
    //注入tk mybatis接口代理对象
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testFindAll(){
        userMapper.selectAll().forEach(user -> System.out.println(user));
    }
    @Test
    public void testFindById(){
        User user = userMapper.selectByPrimaryKey(2);
        System.out.println(user);
    }

    @Test
    public void Insert() {
        User user = new User();
        user.setAge(18);
        user.setName("阔刀");
        user.setBirthday(new Date());
        user.setUserName("kuodao");
        userMapper.insert(user);
    }
    @Test
    public void testByExample(){
        Example example = new Example(User.class);
        example.createCriteria().andLike("name","%a%");
        userMapper.selectByExample(example).forEach(user -> System.out.println(user));
    }

    /**
     * 自定义xml映射
     */
    @Test
    public void testFindByUser(){
        User user = new User();
        user.setName("a");
        user.setNote("震刀");
        userMapper.findByUser(user).forEach(user1 -> System.out.println(user1));
    }
}