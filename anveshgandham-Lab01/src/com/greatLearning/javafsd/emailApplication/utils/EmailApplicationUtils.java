package com.greatLearning.javafsd.emailApplication.utils;


public class EmailApplicationUtils {
	public static String getDepartment(int code) {
		String department = "";
		switch(code) {
		case 1: 
			department = "technical";
			break;
		case 2: 
			department = "admin";
			break;
		case 3: 
			department = "hr";
			break;
		case 4: 
			department = "legal";
			break;
		default:
			System.out.println("Invalid input. Please select code between 1 and 4");
			System.exit(-1);
			break;
		}
		return department;
	}
}
