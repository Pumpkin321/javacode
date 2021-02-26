package com.xupt.service.impl;

import com.xupt.dao.AccountDao;
import com.xupt.dao.impl.AccountImpl;
import com.xupt.service.AccountService;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/2 16:35
 */

public class AccountServiceImpl  implements AccountService {

    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    public void transfer(String outMan,String inMan,double money){
        //开启事务
        accountDao.out(outMan, money);
        int i=1/0;
        accountDao.in(inMan, money);
        //提交事务
    }
}
