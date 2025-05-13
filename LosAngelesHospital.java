package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LosAngelesHospital implements HeadHospital {

    private Document losAngelesDocument;
    
    @Autowired
    public LosAngelesHospital(Document losAngelesDocument) {
        super();
        this.losAngelesDocument = losAngelesDocument;
    }

    @Override
    public void doDocumentVerification() {
        System.out.println("Document Verificationdone using  " + losAngelesDocument.getIdProof());
    }

    @Override
    public void provideTreatment() {
        System.out.println("TreatmenT is in progress for   " + losAngelesDocument.getName() + " with condition " + losAngelesDocument.getCondition() + " at Los Angeles Hospital");
    }
}
	 	  	      	 	    	      	    	      	 	
