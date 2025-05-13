package com.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
@ComponentScan(basePackages = "com.spring.app")
public class ApplicationConfig {
    
	@Bean("ledHome")
	public SmartHome ledHome(LEDLighting lightingSystem) {
	    return new SmartHome("Eco Friendly House", lightingSystem);
	}

	@Bean("incandescentHome")
	public SmartHome incandescentHome(IncandescentLighting lightingSystem) {
	    return new SmartHome("Classic Beauty Home", lightingSystem);
	}

}
