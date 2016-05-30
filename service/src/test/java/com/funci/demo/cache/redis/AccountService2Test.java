package com.funci.demo.cache.redis;

import static org.junit.Assert.assertNotNull;

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
import com.funci.demo.cache.common.AccountService2;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationBootstrap.class)
@WebIntegrationTest(randomPort = true)
public class AccountService2Test {
    @Autowired
    private AccountService2 accountService2;

    private final Logger logger = LoggerFactory.getLogger(AccountService2Test.class);

    @Before
    public void setUp() throws Exception {
        
    }

    @Test
    public void testInject(){
        assertNotNull(accountService2);
    }

    @Test
    public void testGetAccountByName() throws Exception {
        logger.info("first query...");
        accountService2.getAccountByName("tankeyuan");

        logger.info("second query...");
        accountService2.getAccountByName("tankeyuan");
    }
}
