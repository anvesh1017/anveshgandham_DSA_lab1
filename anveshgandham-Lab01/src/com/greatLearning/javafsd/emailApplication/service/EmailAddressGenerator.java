package com.greatLearning.javafsd.emailApplication.service;

import com.greatLearning.javafsd.emailApplication.utils.EmailApplicationUtils;

public class EmailAddressGenerator {
	
	public String generate(String firstName, String lastName, int departmentCode) {
		
		StringBuilder emailAddress = new StringBuilder();
		
		String departmentName = EmailApplicationUtils.getDepartment(departmentCode);
		
		emailAddress.append(firstName.toLowerCase());
		emailAddress.append(".");
		emailAddress.append(lastName.toLowerCase());
		emailAddress.append("@");
		emailAddress.append(departmentName);
		emailAddress.append(".gl.com");
		
		String email = emailAddress.toString();
		
		return email;
	}

}
