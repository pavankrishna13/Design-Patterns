package com.logger;

public class SingletonMain {

	public static void main(String[] args) {
		Logger logger;
		logger = Logger.getInstance();
		
		logger.logMessage("This is the first message");
		
		Logger logger2 = Logger.getInstance();
		logger2.logMessage("This is the second message");
		
		DummyCaller dummy = new DummyCaller();
		dummy.show();
		
		System.out.println(logger == logger2);
		
		
		NonSingletonLogger nlogger = new NonSingletonLogger();
		nlogger.logMessage(" This is the first message");
		
		NonSingletonLogger nlogger1 = new NonSingletonLogger();
		nlogger1.logMessage(" This is the second message");
		
		System.out.println(nlogger == nlogger1);
	}

}
