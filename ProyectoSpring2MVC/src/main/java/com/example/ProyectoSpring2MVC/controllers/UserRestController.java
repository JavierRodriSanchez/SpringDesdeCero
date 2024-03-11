package com.example.ProyectoSpring2MVC.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserRestController {

	@GetMapping("/details")	
	public Map<String, Object> details() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("title","Hola Mundo Spring Boot");
		model.put("name","Javier");
		model.put("lastname","Rodri");
		
		
		return model;
	}
	
	
}
