package com.shubham.ecom_optimum.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebContoller {

	@GetMapping("/")
	public String Greet() {
		return "Hello";
	}
	
	@GetMapping("/status")
	public String status() {
<<<<<<< HEAD
		return "Program is ruunnning by swati kadaskar shubham";
>>>>>>> 045e7e4f131879f398ec6855c8ff231fc750732a
	}
}
