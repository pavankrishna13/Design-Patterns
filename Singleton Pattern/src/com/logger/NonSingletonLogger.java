package com.logger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class NonSingletonLogger {
	
	String fileName = "/Users/prampalli/Documents/Design Patterns/logNonSingleton.txt";
	
	PrintWriter printWriter;
	
	public NonSingletonLogger() {
		try {
			printWriter = new PrintWriter(fileName);
			System.out.println("Creates logger for every new instance. Created a new non singleton logger");
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
