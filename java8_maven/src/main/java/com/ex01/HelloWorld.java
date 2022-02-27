package com.ex01;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
	private static final Logger logger = LogManager.getLogger("HelloWorld");
	public static void main(String[] args) {
		logger.info("Hello, World!");
		logger.error("Hello, World!");
		logger.debug("Opening connection to {}...");
		logger.printf(Level.ERROR, "Logging in user %1$s with birthday %2$tm %2$te,%2$tY", "asdf", "user.getBirthdayCalendar()");


		// pre-Java 8 style optimization: explicitly check the log level
		// to make sure the expensiveOperation() method is only called if necessary
		if (logger.isTraceEnabled()) {
			logger.trace("Some long-running operation returned {}", expensiveOperation());
		}

		// Java-8 style optimization: no need to explicitly check the log level:
		// the lambda expression is not evaluated if the TRACE level is not enabled
		logger.trace("Some long-running operation returned {}", () -> expensiveOperation());
	}

	private static Throwable expensiveOperation() {


		return null;
	}
}