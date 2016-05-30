package com.funci.demo.cache.redis;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funci.ApplicationBootstrap;
import com.funci.demo.cache.common.Account;
import com.funci.demo.cache.common.AccountService3;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationBootstrap.class)
@WebIntegrationTest(randomPort = true)
public class AccountService3Test {

   @Autowired
    private AccountService3 accountService3;

    private final Logger logger = LoggerFactory.getLogger(AccountService3Test.class);

    @Before
    public void setUp() throws Exception {       
    }

    @Test
    public void testGetAccountByName() throws Exception {

        logger.info("first query.....");
        accountService3.getAccountByName("accountName");

        logger.info("second query....");
        accountService3.getAccountByName("accountName");

    }

    @Test
    public void testUpdateAccount() throws Exception {
        Account account1 = accountService3.getAccountByName("accountName1");
        logger.info(account1.toString());
        Account account2 = accountService3.getAccountByName("accountName2");
        logger.info(account2.toString());

        account2.setId(121212);
        accountService3.updateAccount(account2);

        // account1会走缓存
        account1 = accountService3.getAccountByName("accountName1");
        logger.info(account1.toString());
        // account2会查询db
        account2 = accountService3.getAccountByName("accountName2");
        logger.info(account2.toString());

    }

    @Test
    public void testReload() throws Exception {
        accountService3.reload();
        // 这2行查询数据库
        accountService3.getAccountByName("somebody1");
        accountService3.getAccountByName("somebody2");

        // 这两行走缓存
        accountService3.getAccountByName("somebody1");
        accountService3.getAccountByName("somebody2");
    }
}
