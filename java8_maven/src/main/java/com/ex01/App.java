package com.ex01;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.LoggerContext;

import javax.security.auth.login.Configuration;
import java.util.List;

public class App {


	public static void main( String[] args ) {
		TestService service = new TestService();
		service.retrieveMessage();
		service.retrieveMessage();
		service.exampleException();
	}
}