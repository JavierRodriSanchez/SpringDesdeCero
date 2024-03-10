package com.example.ProyectoSpring2MVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

	
	@GetMapping("/details")
	public String details() {
		
		
		return "details";
	}
	
	
	
}
