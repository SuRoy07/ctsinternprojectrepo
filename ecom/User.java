package com.ecp.model;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String UserId;
    private String firstName;
    private String lastName;
    private String emailId;
	public User(String userId, String firstName, String lastName, String emailId) {
		super();
		UserId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	public User() {
		super();
	}
    
}
