package com.cts.patient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.patient.config.AppConfig;
import com.cts.patient.service.*;

public class Main {

	public static void main(String[] args) {
	    ApplicationContext context = new AnnotationConfigApplicationContext(com.cts.patient.config.AppConfig.class);
        PatientService patientService = context.getBean(PatientService.class);
        patientService.getPatientDetails();
	//fill the code

	}

}
