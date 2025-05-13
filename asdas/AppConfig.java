package com.cts.patient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.cts.patient.model.Patient;
import com.cts.patient.service.PatientService;

@Configuration
@ComponentScan("com.cts.patient")
@PropertySource("classpath:patient_details.properties")

//fill the code
public class AppConfig {
     @Bean
    Patient patient() {
        return new Patient();
    }

    @Bean
    PatientService patientService() {
        return new PatientService();
    }

	//fill the code
}
	 	  	  		    	  	      	      	 	
