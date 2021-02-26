package com.xupt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.xupt.dao.AccountDao;
import com.xupt.service.AccountService;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/2 16:35
 */
@Service("accountService")
public class AccountServiceImpl  implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void transfer(String outMan,String inMan,double money){
        //开启事务
        accountDao.out(outMan, money);
//        int i=1/0;
        accountDao.in(inMan, money);
        //提交事务
    }


}
