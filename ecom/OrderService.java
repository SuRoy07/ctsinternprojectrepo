package com.ecp.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;

import com.ecp.model.Order;
import java.util.*;
@Service
public class OrderService {

	private ArrayList<Order> orderList=new ArrayList<Order>();

	public ArrayList<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}

	public OrderService() {
		Order obj1=new Order("O101","Cloth",10,150.00);
		Order obj2=new Order("O102","Cosmetics",2,1500.00);
		Order obj3=new Order("O103","Toys",1,2000.00);
		Order obj4=new Order("O104","Grocery",4,1150.00);
		Order obj5=new Order("O105","Books",5,350.00);
		Order obj6=new Order("O106","Phone",10,33150.00);
		Order obj7=new Order("O107","Camera",10,4550.00);
		
		orderList.add(obj1);
		orderList.add(obj2);
		orderList.add(obj3);
		orderList.add(obj4);
		orderList.add(obj5);
		orderList.add(obj6);
		orderList.add(obj7);
	}
	
	public boolean add(Order orderObj)
	{
        return orderList.add(orderObj);	
	    
	}
	public List<Order> viewAll()
	{
		return orderList;
	}
}
