package com.ecp.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ecp.model.User;
import com.ecp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping(value="/ECP/add",produces="application/json")
	public boolean add(@RequestBody User user)
	{
		return service.add(user);
	}
    @GetMapping(value="ECP/viewAll",produces="application/json")
    public List<User> viewAll()
	{
		return service.viewAll();
	}
}
