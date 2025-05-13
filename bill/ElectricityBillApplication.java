package com.cts.handson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import java.util.List;
import com.cts.handson.dao.EBillDAO;
import com.cts.handson.model.EBill;
import com.cts.handson.util.DateUtil;
@ComponentScan("com.cts.handson")
public class ElectricityBillApplication {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		//get dao bean
		EBillDAO dao = (EBillDAO) appContext.getBean("ebilldao");
		//delete ebill
		try{
		    dao.deleteBill(100,99);
		}catch(Exception e){
		   System.out.println(e); 
		}
		
		System.out.format("%-5s %-15s %-10s %10s %5s %s\n", "Id","Consumer Id","Month","Reading","Unit","Amount");
		//display all bills
		List<EBill> list = dao.getAllBill();
		for(EBill e:list){
		    System.out.format("%-5s %-15s %-10s %10s %5s %s\n",e.getBillNumber(),e.getConsumerId(),e.getBillingMonth(),e.getReading(),e.getUnit(),e.getAmount());
		}
	}
}
	 	  	  		    	  	      	      	 	
