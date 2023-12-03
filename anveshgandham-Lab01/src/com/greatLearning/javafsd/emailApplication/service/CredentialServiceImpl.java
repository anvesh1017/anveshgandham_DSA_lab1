package com.greatLearning.javafsd.emailApplication.service;

import com.greatLearning.javafsd.emailApplication.model.Employee;

public class CredentialServiceImpl implements ICredentialService{

    public String generatePassword() {

       PasswordGenerator passwordGen = new PasswordGenerator();
       
       String password = passwordGen.generate();
       
       return password;
    }

    public String generateEmailAddress(String firstName, String lastName, int departmentCode) {
    	
    	EmailAddressGenerator emailGenerator = new EmailAddressGenerator();
    	
    	String email = emailGenerator.generate(firstName, lastName, departmentCode);
        
        return email;
    }

    public void displayCredentials(Employee employee) {
    		
    	StringBuilder messageBuilder = new StringBuilder();
    	
    	messageBuilder.append("Dear,");
    	messageBuilder.append(employee.getFirstName());
    	messageBuilder.append(", your generated credentials are as follows");
    	
    	String newline = System.getProperty("line.separator");
    	messageBuilder.append(newline);
    	messageBuilder.append("Email : ");
    	messageBuilder.append(employee.getEmailAddress());
    	
    	messageBuilder.append(newline);
    	messageBuilder.append("Password :");
    	messageBuilder.append(employee.getPassword());
    	
    	String finalMessage = messageBuilder.toString();
    	
    	System.out.println(finalMessage);
    }

}
