package com.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doNothing;

import com.model.Employee;
import com.service.EmployeeService;
import com.repo.EmployeeRepo;

import java.io.*;
@ExtendWith(MockitoExtension.class)
public class EmployeeTest {
	
	//Add the appropriate annotation
	@Mock
	EmployeeRepo repo;
	
	//Add the appropriate annotation
	@InjectMocks
	EmployeeService service;
	
	//Test the addEmployee method in EmployeeService class
	@Test
	public void test1AddEmployee() {	 	  	 	      	     	      	 	   	 	
	    
		// Fill the code
		// Use when().thenReturn() method
		Employee employee = new Employee(1,"Ram","ram@gmail.com",50000.00);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(employee);
		
		when(repo.addEmployeeToList(employee)).thenReturn(empList.size());
		assertEquals(empList.size(),service.addEmployee(employee));
		
	}
	
	//Test the deleteEmployee method in EmployeeService class
	@Test
	public void test2DeleteEmployee() {
		
		// Fill the code
		//Use verify() method	
		Employee employee = new Employee(1,"Ram","ram@gmail.com",50000.00);
        service.deleteEmployee(employee);
        verify(repo).deleteEmployeeFromList(employee);
		
	}
	
	//Test the fetchEmployeeById method in EmployeeService class for a valid employeeId
	@Test
	public void test3FetchEmployeeByEmployeeId() {
		
		// Fill the code
		// Use when().thenReturn() method
		Employee employee = new Employee(1,"Ram","ram@gmail.com",50000.00);
		when(repo.getEmployeeByEmployeeId(1)).thenReturn(employee);
		assertEquals(employee,service.fetchEmployeeById(1));
	}
	
	//Test the fetchEmployeeById method in EmployeeService class for an invalid employeeId
	@Test
	public void test4FetchEmployeeByEmployeeIdWhenNull() {	 	  	 	      	     	      	 	   	 	
		
		// Fill the code
		// Use assertThrows
		when(repo.getEmployeeByEmployeeId(1)).thenReturn(null);
		assertThrows(NullPointerException.class,
		    ()->{
		        service.fetchEmployeeById(1);
		    }
		);
	}
	
	//Test the fetchEmployee method in EmployeeService class
	@Test
	public void test5FetchEmployee() {
		
		// Fill the code
		// Use when().thenReturn() method
		List<Employee>empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"Ram","ram@gmail.com",50000.00));
		when(repo.getEmployee()).thenReturn(empList);
		assertEquals(empList,service.fetchEmployee());
	}
	
}
	 	  	 	      	     	      	 	   	 	
