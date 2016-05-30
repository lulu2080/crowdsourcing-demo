package com.funci.demo.cache.common;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.google.common.base.Optional;

@Component
public class AccountService {

    private final Logger logger = LoggerFactory.getLogger(AccountService.class);

    // 使用了一个缓存名叫 accountCache
    @Cacheable(value="accountCache")
    public Account getAccountByName(String accountName) {
        // 方法内部实现不考虑缓存逻辑，直接实现业务    	
        logger.info("real querying account... {}", accountName);
        Optional<Account> accountOptional = getFromDB(accountName);
        if (!accountOptional.isPresent()) {
            throw new IllegalStateException(String.format("can not find account by account name : [%s]", accountName));
        }
       return  accountOptional.get();
    }

    // 更新 accountCache 缓存
    @CachePut(value="accountCache",key="#account.getName()")   
    public void updateAccountForCachePut(Account account) {
        updateDB(account);
    }
    
    // 清除 accountCache 缓存
     
    @CacheEvict(value="accountCache",key="#account.getName()")
    public void updateAccountForCacheEvict(Account account) {
        updateDB(account);
    }

    @CacheEvict(value="accountCache",allEntries=true, beforeInvocation=true)
    public void reload() {
    }
    
    

    private void updateDB(Account account) {
        logger.info("real update db...{}", account.getName());
    }

    private Optional<Account> getFromDB(String accountName) {
        logger.info("real querying db... {}", accountName);
        //Todo query data from database
        return Optional.fromNullable(new Account(accountName));
    }
    

}