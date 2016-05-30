package com.funci.demo.mail.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ouyeel.xplat.tool.mail.MailSettings;
import com.ouyeel.xplat.tool.mail.XplatJavaMailSender;
import com.ouyeel.xplat.tool.mail.XplatJavaMailSenderImpl;

/**
 * Created by kk580kk on 4/24/16.
 */
@Configuration
@EnableConfigurationProperties(MailSettings.class)
public class MailAutoConfiguration {
    @Autowired
    MailSettings mailSettings;

    @Bean(name = "javaMailSender_1")
    XplatJavaMailSender javaMailSender_1() {
    	XplatJavaMailSenderImpl javaMailSender = new XplatJavaMailSenderImpl();
        javaMailSender.setHost(mailSettings.getMailHost()[0]);
        javaMailSender.setPassword(mailSettings.getMailPassword()[0]);
        javaMailSender.setUsername(mailSettings.getMailUsername()[0]);
        return javaMailSender;
    }

    @Bean(name = "javaMailSender_2")
    XplatJavaMailSender javaMailSender_2() {
    	XplatJavaMailSenderImpl javaMailSender = new XplatJavaMailSenderImpl();
        javaMailSender.setHost(mailSettings.getMailHost()[1]);
        javaMailSender.setPassword(mailSettings.getMailPassword()[1]);
        javaMailSender.setUsername(mailSettings.getMailUsername()[1]);
        return javaMailSender;
    }
}
