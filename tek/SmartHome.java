package com.spring.app;

import org.springframework.stereotype.Component;

public class SmartHome {
    
    private String name;
    private LightingSystem lightingSystem;

    
    public SmartHome(String name, LightingSystem lightingSystem) {
        this.name = name;
        this.lightingSystem = lightingSystem;
    }

    
         public void getReport() {
        System.out.println(name + " with " + lightingSystem.getType() + 
                           " lighting gives an efficiency rating of " + 
                           lightingSystem.getEfficiencyRating());
    }
    

  
}
