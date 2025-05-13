package com.spring.app;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Loan loan = (Loan) ctx.getBean("smartLoan");
		System.out.println("Welcome to Loan Processing System");
		System.out.println("Customer Name: " + loan.getCustomerName());
		System.out.println("Customer ID: " + loan.getCustomerId());

		System.out.println("Enter loan amount");
		double loanAmount = scanner.nextDouble();
		System.out.println("Enter loan tenure in months");
		int tenure = scanner.nextInt();
		scanner.nextLine(); 
		System.out.println("Enter loan type");
		String loanType = scanner.nextLine();
		double emi = loan.calculateEMI(loanAmount, tenure, loanType);
		if (emi < 0) {
			System.out.println("Invalid Input");
		} else {
			DecimalFormat decimalFormat = new DecimalFormat("#.##");
			System.out.println("Your EMI for " + tenure + " months will be $" + decimalFormat.format(emi));
		}
	}
}	 	  	  	 		     	   	      	 	
