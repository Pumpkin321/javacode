package com.service;

import com.domain.Account;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/20 16:53
 */

public interface AccountService  {
    void save(Account account) ;
    List<Account> findAll();


}
