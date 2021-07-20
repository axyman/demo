package com.example.demo.dao;

import com.example.demo.model.Account;
import com.example.demo.vo.AccountVo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: demo
 * @description: 调取jpa接口
 * @author: axyman
 * @create: 2021-07-20 21:54
 **/
public interface AccountRepository extends JpaRepository<Account,String> {
    Account findByAccount(String account);
}
