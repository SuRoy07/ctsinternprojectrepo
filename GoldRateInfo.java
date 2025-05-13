package com.spring.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

//use appropriate annotation to make this class as component class
@Component
public class GoldRateInfo {
    
    //use appropriate annotation
    @Value("#{${gold.rate}}")
	private Map<Integer,Double>rateInfo;

	public Map<Integer, Double> getRateInfo() {
		return rateInfo;
	}

	public void setRateInfo(Map<Integer, Double> rateInfo) {
		this.rateInfo = rateInfo;
	}
	
	public double calculateGoldRate(int goldCarat, double grams) 
	{
		double totalRate=0.0;
		
		//Fill the code here
		
		totalRate= rateInfo.getOrDefault(goldCarat, 0.0) * grams;
		
		return totalRate;
	}
}
