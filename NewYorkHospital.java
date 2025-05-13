package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewYorkHospital implements HeadHospital {

    private Document newYorkDocument;
        
    @Autowired
    public NewYorkHospital(Document newYorkDocument) {
        super();
        this.newYorkDocument = newYorkDocument;
    }

    @Override
    public void doDocumentVerification() {
        System.out.println("DOcument  verification done using " + newYorkDocument.getIdProof());
    }

    @Override
    public void provideTreatment() {
        System.out.println("Treatment Isin  progress for " + newYorkDocument.getName() + " with condition " + newYorkDocument.getCondition() + " at New York Hospital");
    }
}
	 	  	      	 	    	      	    	      	 	
