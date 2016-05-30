package com.funci.demo.cache.common;

import com.google.common.base.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 
 * @author tankeyuan
 *
 */
@Service
public class AccountService4 {

    private final Logger logger = LoggerFactory.getLogger(AccountService4.class);

    // 使用了一个缓存名叫 accountCache
    @Cacheable(value="accountCache")
    public Account getAccountByName(String accountName) {
        // 方法内部实现不考虑缓存逻辑，直接实现业务
        logger.info("real querying account... {}", accountName);
        Optional<Account> accountOptional = getFromDB(accountName);
        if (!accountOptional.isPresent()) {
            throw new IllegalStateException(String.format("can not find account by account name : [%s]", accountName));
        }

        return accountOptional.get();
    }

 // 更新 accountCache 缓存
    @CachePut(value="accountCache",key="#account.getName()")
    public Account updateAccount(Account account) {
        return updateDB(account);
    }

   

    private Account  updateDB(Account account) {
        logger.info("real update db...{}", account.getName());
        return account;
    }

    private Optional<Account> getFromDB(String accountName) {
        logger.info("real querying db... {}", accountName);
        //Todo query data from database
        return Optional.fromNullable(new Account(accountName));
    }
}
