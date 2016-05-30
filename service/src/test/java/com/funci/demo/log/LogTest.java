package com.funci.demo.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	private final static Logger logger = LoggerFactory.getLogger(LogTest.class);
	@Test
	public void test() {
		logger.info("Order service find all ......");
	}

}
