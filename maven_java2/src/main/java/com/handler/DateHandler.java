package com.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/18 16:38
 */

public class DateHandler extends BaseTypeHandler<Date> {
    //将JAVA类型转换成数据库需要的类型
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Date date, JdbcType jdbcType) throws SQLException {
        long time = date.getTime();
        preparedStatement.setLong(i,time);
    }
    //将数据库中某些数据类型转换成JAVA数据类型
    //String参数 要转换的字段名称
    //ResultSet 查询出的结果集
    public Date getNullableResult(ResultSet resultSet, String s) throws SQLException {
        //将获取的结果集中需要的数据（long）转换成Date类型 并返回
        long aLong = resultSet.getLong(s);
        Date date = new Date(aLong);
        return date;
    }
    //将数据库中某些数据类型转换成JAVA数据类型
    public Date getNullableResult(ResultSet resultSet, int i) throws SQLException {
        long aLong = resultSet.getLong(i);
        Date date = new Date(aLong);
        return date;
    }
    //将数据库中某些数据类型转换成JAVA数据类型
    public Date getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        long aLong = callableStatement.getLong(i);
        Date date = new Date(aLong);
        return date;
    }
}
