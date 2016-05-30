package com.funci.demo.cache.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funci.ApplicationBootstrap;
import com.funci.demo.cache.common.Account;
import com.funci.demo.cache.common.AccountService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationBootstrap.class)
@WebIntegrationTest(randomPort = true)
public class AccountServiceTest {
	 private final Logger logger = LoggerFactory.getLogger(AccountServiceTest.class);

	@Autowired
	AccountService accountService;
	
	@Autowired
    private CacheManager cacheManager;
	
	
	@Test
    public void testGetAccountByName() throws Exception {

        logger.info("first query.....");
        accountService.getAccountByName("accountName");

        logger.info("second query....");
        accountService.getAccountByName("accountName");

    }
	
	@Test
    public void testUpdateAccountForCachePut() throws Exception {
        Account account1 = accountService.getAccountByName("accountName1");
        logger.info(account1.toString());
        Account account2 = accountService.getAccountByName("accountName2");
        logger.info(account2.toString());

        account2.setId(121212);
        accountService.updateAccountForCachePut(account2);

        // account1会走缓存
        account1 = accountService.getAccountByName("accountName1");
        logger.info(account1.toString());
        // account2会查询db
        account2 = accountService.getAccountByName("accountName2");
        logger.info(account2.toString());

    }
	
	@Test
    public void testUpdateAccountForCacheEvict() throws Exception {
        Account account1 = accountService.getAccountByName("accountName1");
        logger.info(account1.toString());
        Account account2 = accountService.getAccountByName("accountName2");
        logger.info(account2.toString());

        account2.setId(121212);
        accountService.updateAccountForCacheEvict(account2);

        // account1会走缓存
        account1 = accountService.getAccountByName("accountName1");
        logger.info(account1.toString());
        // account2会查询db
        account2 = accountService.getAccountByName("accountName2");
        logger.info(account2.toString());

    }

    @Test
    public void testReload() throws Exception {
        accountService.reload();
        // 这2行查询数据库
        accountService.getAccountByName("somebody1");
        accountService.getAccountByName("somebody2");

        // 这两行走缓存
        accountService.getAccountByName("somebody1");
        accountService.getAccountByName("somebody2");
    }

}
