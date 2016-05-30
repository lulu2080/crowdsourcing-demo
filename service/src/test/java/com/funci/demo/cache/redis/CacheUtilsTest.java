package com.funci.demo.cache.redis;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funci.ApplicationBootstrap;
import com.funci.demo.cache.common.Account;
import com.funci.demo.cache.common.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationBootstrap.class)
@WebIntegrationTest(randomPort = true)
public class CacheUtilsTest {
   
    @Autowired
    private AccountService accountService;
	
    @Autowired
     private CacheManager cacheManager;

    @Test
    public void test() {
	accountService.getAccountByName("accountName");
	Cache cache=cacheManager.getCache("accountCache");
	ValueWrapper vw=cache.get("accountName");
	assertEquals(((Account)vw.get()).getName(),"accountName");
    }

}
