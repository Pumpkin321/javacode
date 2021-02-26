package com.test;

import com.dao.EmpMapper;
import com.dao.OrderMapper;
import com.dao.UserMapper;
import com.domain.Emp;
import com.domain.Order;
import com.domain.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.xdevapi.SessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/26 17:30
 */

public class MybatisTest {
    @Test
    public void test4() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id

        sqlSession.delete("userMapper.delete",122131);
        //mybatis执行更新操作，提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test3() throws IOException {
        User user = new User();
        user.setId(122131);
        user.setUsername("mybatis");
        user.setPassword("java");

        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id

        sqlSession.update("userMapper.update",user);
        //mybatis执行更新操作，提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test2() throws IOException {
        User user = new User();
        user.setId(122131);
        user.setUsername("hello");
        user.setPassword("world");

        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id

        sqlSession.insert("userMapper.save",user);
        //mybatis执行更新操作，提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test1() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id
        List<User> userList = sqlSession.selectList("userMapper.findAll");
        System.out.println(userList);
        sqlSession.close();
    }

    @Test
    //查询一个对象
    public void test5() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id
        User user = sqlSession.selectOne("userMapper.findById", 112);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    //动态代理调用Mapper
    public void test6() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
        sqlSession.close();
    }

    @Test
    //动态SQL if 语句测试
    public void test7() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //模拟条件user
        User condition = new User();
//        condition.setId(112);
        condition.setUsername("jack");
//        condition.setPassword("cyb321");

        List<User> userList = userMapper.findByCondition(condition);
        System.out.println(userList);
    }

    @Test
    //动态SQL foreach 语句测试
    public void test8() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<Integer> list = new ArrayList<Integer>();
        list.add(112);
        list.add(123);

        List<User> userList = userMapper.findByIds(list);
        System.out.println(userList);
    }

    @Test
    //typeHandler测试
    public void test9() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp();
//        emp.setId(1);
        emp.setName("陈奕斌");
        emp.setBirthday(new Date());
        empMapper.save(emp);
//        Emp emp = empMapper.findById(1);
//        System.out.println(emp);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //Plugin测试
    //PageHelper
    public void test10() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        //设置分页相关参数 当前页+每页显示的条数
        PageHelper.startPage(3,2);

        List<Emp> empList = empMapper.findAll();
        for (Emp emp:empList){
            System.out.println(emp);
        }
        //获得与分页相关参数
        PageInfo<Emp> pageInfo = new PageInfo<Emp>(empList);
        System.out.println("当前页："+pageInfo.getPageNum());
        System.out.println("每页显示条数："+pageInfo.getPageSize());
        System.out.println("总条数："+pageInfo.getTotal());
        System.out.println("总页数："+pageInfo.getPages());
        System.out.println("上一页："+pageInfo.getPrePage());
        System.out.println("下一页："+pageInfo.getNextPage());
        System.out.println("是否是第一页："+pageInfo.isIsFirstPage());
        System.out.println("是否是最后一页："+pageInfo.isIsLastPage());
    }
    @Test
    //多表查询 一对一
    public void test11() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = orderMapper.findAll();
        for (Order order:orderList){
            System.out.println(order);
        }
        sqlSession.close();
    }

    @Test
    //多表查询 一对多
    public void test12() throws IOException{
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);

        List<Emp> empList = empMapper.findAll();
        for (Emp emp:empList){
            System.out.println(emp);
        }
    }

    @Test
    //多表查询 多对多
    //多对多查询的模型
    //用户表和角色表的关系为，-个用户有多个角色, -个角色被多个用户使用
    //多对多查询的需求:查询用户同时查询出该用户的所有触
    public void test13() throws IOException{
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句 参数：namespace+id
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);

        List<Emp> empList = empMapper.findEmpAndRoleAll();
        for (Emp emp:empList){
            System.out.println(emp);
        }
    }
}

