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
import com.funci.demo.cache.common.AccountService4;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationBootstrap.class)
@WebIntegrationTest(randomPort = true)
public class AccountService4Test {

   @Autowired
    private AccountService4 accountService4;

    private final Logger logger = LoggerFactory.getLogger(AccountService4Test.class);

    @Before
    public void setUp() throws Exception {       
    }    

    @Test
    public void testUpdateAccount() throws Exception {
	Account account = accountService4.getAccountByName("someone"); 
	account.setPassword("123"); 
	accountService4.updateAccount(account); 
	account.setPassword("321"); 
	accountService4.updateAccount(account); 
	account = accountService4.getAccountByName("someone"); 
	logger.info(account.getPassword()); 
    }

   
}
