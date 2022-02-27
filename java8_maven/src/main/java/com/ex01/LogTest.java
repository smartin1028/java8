package com.ex01;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public LogTest(){
		logger.info("test");
	}

	public static void main(String[] args) {
		new LogTest();
	}

}
