package com.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.app")
public class AppConfig {
    
    @Bean
    public Document newYorkDocument() {
        
        Document document = new Document();
        document.setName("Alice");
        document.setIdProof("Insurance");
        document.setCondition("Flu");
        
        return document;
    }
    
    @Bean
    public Document losAngelesDocument() {
        
        Document document = new Document();
        document.setName("Bob");
        document.setIdProof("ID Card");
        document.setCondition("Sprain");
        
        return document;
    }
}
	 	  	      	 	    	      	    	      	 	
