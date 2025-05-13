package com.spring.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IncandescentLighting extends LightingSystem {
		@Value("600")
	    private int luminosity;
		 @Value("60")
	    private int energyConsumption;
		 @Value("incandescent")
	    private String type;
	    
	    public int getLuminosity() {
			return luminosity;
		}

		
		public void setLuminosity(int luminosity) {
			this.luminosity = luminosity;
		}

		public int getEnergyConsumption() {
			return energyConsumption;
		}

		 
		public void setEnergyConsumption(int energyConsumption) {
			this.energyConsumption = energyConsumption;
		}


		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}


	@Override
	public int getEfficiencyRating() {

		int efficiencyRating = getLuminosity() / getEnergyConsumption();
		
		
        return efficiencyRating;
	}

	

}
