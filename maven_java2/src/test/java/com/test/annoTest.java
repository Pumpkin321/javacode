package com.test;

import com.dao.EmpMapper;
import com.dao.StuMapper;
import com.domain.Stu;
import com.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/19 17:40
 */

public class annoTest {
    private StuMapper stuMapper;
    @Before
    public void before() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.XML");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //执行sql语句 参数：namespace+id
        stuMapper = sqlSession.getMapper(StuMapper.class);
    }
   @Test
   public void testSave(){
        Stu stu = new Stu();
        stu.setName("zjh");
        stu.setPhoneNum("2312312");
        stuMapper.save(stu);
   }
   @Test
    public void testupdate(){
        Stu stu = new Stu();
        stu.setId(1);
        stu.setName("cyb");
        stu.setPhoneNum("173020");
        stuMapper.update(stu);
    }

    @Test
    public void testdelete(){
        Stu stu = new Stu();
        stuMapper.delete(1);
    }

    @Test
    public void testfindById(){
        Stu stu = stuMapper.findById(1);
        System.out.println(stu);
    }

    @Test
    public void testfinAll(){
        List<Stu> stuList = stuMapper.findAll();
        System.out.println(stuList);
    }
}
