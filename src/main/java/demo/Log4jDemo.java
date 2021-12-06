package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	static Logger logger= LogManager.getLogger(Log4jDemo.class);


	public static void main(String[] args) {

		System.out.println("\n Hello World! \n");
		logger.error("this is an error message");
		
	    logger.info("Just another message!");
	 	
	    logger.warn("warn message");
		logger.trace("This is a trace message!");
	}

}
