package com.dao.impl;

import com.dao.itemsDAO;
import com.domain.items;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/26 15:00
 */

public class itemsDAOimpl implements itemsDAO {

    public List<items> findAll() throws Exception {
        //先获取connection对象
        Connection connection = null;
        //获取操作数据库的对象
        PreparedStatement pst= null;
        //执行数据库操作
        ResultSet resultSet=null;
        List<items> list = new ArrayList<items>();
        try {
            //加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            //先获取connection对象
            connection = DriverManager.getConnection("jdbc:mysql:///db1?characterEncoding=utf-8&useSSL=false&serverTimezone=UTC","root","cyb321");
            //获取操作数据库的对象
            pst = connection.prepareCall("select * from items");
            //执行数据库操作
            resultSet = pst.executeQuery();
            //把数据库集转换成java的List集合
            while (resultSet.next()){
                items it = new items();
                it.setId(resultSet.getInt("id"));
                it.setName(resultSet.getString("name"));
                list.add(it);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
            pst.close();
            resultSet.close();
        }

        return list;
    }
}
