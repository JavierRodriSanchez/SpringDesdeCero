package com.example.ProyectoSpring2MVC.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoSpring2MVC.models.User;
import com.example.ProyectoSpring2MVC.models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {

	@GetMapping("/details")	
	public UserDto details() {
		
		UserDto dto = new UserDto();
		User user = new User("Andres", "Rodri");
		
		dto.setUser(user);
		dto.setTitle("Hola Spring Boot");
		
		
		return dto;
	}
	
	@GetMapping("/details-map")	
	public Map<String, Object> details2() {
		User user = new User("Andres", "Rodri");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("title","Hola Mundo Spring Boot");
		model.put("user",user);
		
		
		
		return model;
	}
	
}
