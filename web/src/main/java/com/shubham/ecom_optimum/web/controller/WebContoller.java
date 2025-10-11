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

		return "Program is ruunnning by swati & shubham to learn get feacth command& hello you shut up";

	}
}
