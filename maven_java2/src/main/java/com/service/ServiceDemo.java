package com.service;

import com.dao.UserMapper;
import com.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/18 15:11
 */

public class ServiceDemo {
    public static void main(String[] args) throws IOException {
        //创建dao层对象 当前dao层实现是手动编写的
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
        User user = userMapper.findById(112);
        System.out.println(user);
        sqlSession.close();
    }
}
