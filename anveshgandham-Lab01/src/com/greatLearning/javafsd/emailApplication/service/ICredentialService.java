package com.greatLearning.javafsd.emailApplication.service;
import com.greatLearning.javafsd.emailApplication.model.Employee;

public interface ICredentialService {

    String generatePassword();

    String generateEmailAddress(String firstName, String lastName, int departmentCode);

    void displayCredentials(Employee employee);

}
