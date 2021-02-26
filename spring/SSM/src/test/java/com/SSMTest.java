package com;

import com.domain.Account;
import com.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/20 18:40
 */

public class SSMTest {
    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void TEST2(){
        System.out.println(accountMapper);
//        System.out.println(accountMapper.findAll());
        Account account = new Account();
        account.setName("Ctb");
        account.setMoney(2323.33);
        System.out.println(account);
        accountMapper.save(account);
    }


    @Test
    public void Test1() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//        Account account = new Account();
//        account.setName("陈奕斌");
//        account.setMoney(12121.44);
//        mapper.save(account);
        List<Account> accountList = mapper.findAll();
        System.out.println(accountList);
        sqlSession.commit();
        sqlSession.close();
    }
}
