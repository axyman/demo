package com.example.demo;

import com.example.demo.service.impl.AccountServiceImpl;
import com.example.demo.vo.AccountVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description: 测试业务方法
 * @author: axyman
 * @create: 2021-07-20 22:09
 **/
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountServiceTest {
    @Resource
    private AccountServiceImpl accountService;

    @Test
    public void test(){
        AccountVo accountVo = new AccountVo();
        accountVo.setAccount("test");
        accountService.findByAccount(accountVo);
    }

}
