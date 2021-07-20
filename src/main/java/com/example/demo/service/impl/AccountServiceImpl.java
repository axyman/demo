package com.example.demo.service.impl;

import com.example.demo.dao.AccountRepository;
import com.example.demo.model.Account;
import com.example.demo.vo.AccountVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description: 业务层账户实现类
 * @author: axyman
 * @create: 2021-07-20 21:59
 **/
@Service
public class AccountServiceImpl {

    @Resource
    private AccountRepository accountRepository;

    public void addAccount(AccountVo accountVo){
        Account account = new Account();
        account.setAccount(accountVo.getAccount());
        accountRepository.save(account);
    }

    public void updateAccount(AccountVo accountVo){
        accountRepository.findById(accountVo.getId()).ifPresent(a -> {
            a.setAccount(accountVo.getAccount());
            accountRepository.save(a);

        });
    }
    public void findByAccount(AccountVo accountVo){
        Account account = accountRepository.findByAccount(accountVo.getAccount());
        System.out.println(account.getId());
        System.out.println(account.getAccount());
    }

}
