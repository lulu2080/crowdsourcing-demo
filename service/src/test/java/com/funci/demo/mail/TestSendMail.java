package com.funci.demo.mail;

import java.io.File;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funci.ApplicationBootstrap;
import com.ouyeel.xplat.tool.mail.XplatJavaMailSender;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationBootstrap.class)
@WebIntegrationTest(randomPort = true)
public class TestSendMail {
	 @Autowired
	 XplatJavaMailSender javaMailSender_1;
	 @Autowired
	 XplatJavaMailSender javaMailSender_2;

	
	@Test
	 public void testSendMail() {
		 SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		 simpleMailMessage.setFrom(javaMailSender_2.getUserName());
		 simpleMailMessage.setTo("test@baosight.com");
		 simpleMailMessage.setSubject("Test send mail from JavaMailSender");
		 simpleMailMessage.setText("This is test mail sent by JavaMailSender, any question please ask iplat4j@baosight.com");
		 javaMailSender_2.send(simpleMailMessage);
	 }
	

	 /**
	  * 发送添加附件的邮件 
	  * @throws MessagingException
	  */
	 @Test
	 public void testSenderMimeMail() throws MessagingException{ 
		 MimeMessage msg = javaMailSender_2.createMimeMessage(); 
		 MimeMessageHelper helper = new MimeMessageHelper(msg, true); 
		 helper.setFrom(javaMailSender_2.getUserName()); 
		 helper.setTo("test@baosight.com"); 
		 helper.setSubject("Test send mail from JavaMailSender"); 
		 helper.setText("This is test mail sent by JavaMailSender, any question please ask iplat4j@baosight.com"); 
		 helper.setSentDate(new Date()); 
		
		 //夹带附件 
		 FileSystemResource file = new FileSystemResource(new File("D:/pictures/111.gif")); 
		 helper.addAttachment("111.gif", file); 
		 javaMailSender_2.send(msg); 
	 } 

}
