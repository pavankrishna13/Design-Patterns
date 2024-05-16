package com.logger;

public class DummyCaller {
	
	private Logger logger;

	public DummyCaller() {
		logger = Logger.getInstance();
	}
	
	public void show() {
		logger.logMessage("Inside Dummy Caller");
	}
}
