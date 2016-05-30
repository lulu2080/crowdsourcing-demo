package com.funci.demo.transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funci.ApplicationBootstrap;
import com.funci.demo.order.common.domain.Order;
import com.funci.demo.order.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationBootstrap.class)
@WebIntegrationTest(randomPort = true)
public class TestTransaction {
	 @Autowired
	 OrderService orderService;
	

	 @Test
	 public void testTransction1() {
		 orderService.transaction1();
	 }
	 
	 @Test
	 public void testTransction2() {
		 orderService.transaction2();
	 }

	 @Test
	 public void testTransction3() {
		 orderService.transaction3();
	 }
}
