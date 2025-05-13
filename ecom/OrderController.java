package com.ecp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecp.model.Order;
import com.ecp.service.OrderService;
import java.util.List;
@RestController
public class OrderController {

    @Autowired
	private OrderService service;
	
	@PostMapping(value="/ECP/add",produces="application/json")
	public boolean add(@RequestBody Order order)
	{
		return service.add(order);
	}
	@GetMapping(value="/ECP/viewAll",produces="application/json")
	public List<Order> viewAll()
	{
		return service.viewAll();
	}
}
