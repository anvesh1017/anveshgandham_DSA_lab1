package com.greatLearning.javafsd.emailApplication;
import java.util.Scanner;
import com.greatLearning.javafsd.emailApplication.model.Employee;
import com.greatLearning.javafsd.emailApplication.service.*;

public class EmailApplication {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the employee's first name");
		
		String firstName = input.nextLine();
		
		System.out.println("Enter the employee's last name");
		
		String lastName = input.nextLine();
		
		System.out.println("Select the department code");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		int departmentCode = input.nextInt();
		
		input.close();
		
		ICredentialService credentialService = new CredentialServiceImpl();
		
		Employee employee = new Employee(firstName, lastName);
		
		String email = credentialService.generateEmailAddress(firstName, lastName, departmentCode);
		
		employee.setEmailAddress(email);
		
		String password = credentialService.generatePassword();
		
		employee.setPassword(password);
		
		credentialService.displayCredentials(employee);
		
	}

}
