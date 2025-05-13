package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

	@GetMapping(value="/getInfo")
	public String getDetails() {
	    return "This is order application";
	}
	
}
