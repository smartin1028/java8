package com.ex01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTest {


	private static final Logger logger00 = LogManager.getLogger(MyTest.class);
	private static final Logger logger01 = LogManager.getLogger(MyTest.class.getName());
	private static final Logger logger02 = LogManager.getLogger();


	public static void main(String[] args) {
		logger00.error("logger00 Hello, World!");
		logger01.error("logger01 Hello, World!");
		logger02.info("logger02 Hello, World!");

		logger00.trace("We've just greeted the user!");
		logger00.debug("We've just greeted the user!");
		logger00.info("We've just greeted the user!");
		logger00.warn("We've just greeted the user!");
		logger00.error("We've just greeted the user!");
		logger00.fatal("We've just greeted the user!");
	}

}
