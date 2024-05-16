package com.proxy;

public class StatesUtil {
	
	public String getCapital(String state) {
		//assume data extracted from database or remote machine
		switch(state.toLowerCase()) {
		case "ap" : return "Amaravathi";
		case "bihar" : return "Patna";
		case "orissa": return "Bhubaneshwar";
		case "maharastra": return "Mumbai";
		default : return "Unknown";
		}
	}
 
}
