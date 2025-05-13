package com.ecp.model;
import org.springframework.stereotype.Component;
@Component
public class Order {
	private String orderId;
    private String productName;
    private int quantity;
    private double price;
	public Order(String orderId, String productName, int quantity, double price) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	public Order() {
		super();
	}

}
