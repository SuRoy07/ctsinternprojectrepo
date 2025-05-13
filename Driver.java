package com.spring.app;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Use appropriate annotations 

@Configuration
@ComponentScan("com.spring.app")
@PropertySource("classpath:goldRateDetails.properties")
public class Driver {
	
	public static GoldRateInfo loadGoldRateDetails() {
	    
		//Fill the code here
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Driver.class);
        GoldRateInfo g = context.getBean(GoldRateInfo.class);
        return g;
		
// 		return null;
	}
	
    public static void main(String[] args){
	
	    Scanner in=new Scanner(System.in);
	    
	    // Fill the code here
	    
	    System.out.println("Enter the carat:");
        int c=in.nextInt();
        System.out.println("Enter Total Grams:");
        double g=in.nextDouble();
        System.out.println("Total Gold Rate is Rs:"+loadGoldRateDetails().calculateGoldRate(c, g));
	
    }

}
	 	  	    	    		        	 	
