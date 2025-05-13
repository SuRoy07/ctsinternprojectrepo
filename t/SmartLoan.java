package com.spring.app;

import java.util.Map;

public class SmartLoan extends Loan {

    private final Map<String, Double> interestRatesMap;

    public SmartLoan(int customerId, String customerName, Map<String, Double> interestRates) {
        super(customerId, customerName);
        this.interestRatesMap = interestRates;
    }

    @Override
    public double calculateEMI(double loanAmount, int tenure, String loanType) {
        if (loanAmount <= 0 || tenure <= 0 || !interestRatesMap.containsKey(loanType)) {
            return -1;
        }

        double interestRate = interestRatesMap.get(loanType);
        double monthlyInterestRate = interestRate / 12;
        double emi = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -tenure));
        return emi;
    }
}
	 	  	  	 		     	   	      	 	
