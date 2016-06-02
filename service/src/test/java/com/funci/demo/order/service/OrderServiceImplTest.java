package com.funci.demo.order.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/applicationContext*.xml")
public class OrderServiceImplTest {
	
	private final static Logger logger = LoggerFactory.getLogger(OrderServiceImplTest.class);	
	
	@Test
	public void testFindAll() {
		logger.info("Order service find all ......");	
	}

}
