package demo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Logger !");
		logger.info("This is information Msg by Umang");
		logger.error("This is error");
		logger.warn("Warnning Msg");
		logger.fatal("This is fatal");
		
		System.out.println("Completed");
	}

}
