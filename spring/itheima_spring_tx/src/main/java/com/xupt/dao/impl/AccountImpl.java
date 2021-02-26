package com.xupt.dao.impl;

import com.xupt.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/2 16:31
 */

public class AccountImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void out(String outMan, double money) {
        jdbcTemplate.update("update account set money=money-? where name=?",money,outMan);
    }

    public void in(String inMan, double money) {
        jdbcTemplate.update("update account set money=money+? where name=?",money,inMan);
    }
}
