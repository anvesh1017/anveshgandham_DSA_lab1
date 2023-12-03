package com.greatLearning.javafsd.emailApplication.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	private String emailAddress;
	private String password;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String setLastName(String lastName) {
		return this.lastName = lastName;
	}
	
	public String setFirstName(String firstName) {
		return this.firstName = firstName;
	}
	
    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }


    public String getEmailAddress() {
        return emailAddress;
    }


    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}

