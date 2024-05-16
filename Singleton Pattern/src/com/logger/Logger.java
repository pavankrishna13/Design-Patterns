package com.logger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {
	
	String fileName = "/Users/prampalli/Documents/Design Patterns/logSingleton.txt";
	
	PrintWriter printWriter;
	
	private static Logger loggerInstance = null;
	
	public static Logger getInstance() {
		if(loggerInstance == null) {
			loggerInstance = new Logger();
		}
		return loggerInstance;
	}
	
	private Logger() {
		try {
			printWriter = new PrintWriter(fileName);
			System.out.println("Created the logger. Will start logging..");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unable to create logger");
		}
	}
	
	void logMessage(String message) {
		printWriter.println(LocalDateTime.now() + " " + message);
		printWriter.flush();
	}

	protected void finalize() {
		printWriter.close();
	}
}
