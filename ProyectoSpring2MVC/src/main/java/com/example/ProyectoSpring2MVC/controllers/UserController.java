package com.example.ProyectoSpring2MVC.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.ProyectoSpring2MVC.models.User;

@Controller
public class UserController {

	
	@GetMapping("/details")
	public String details(Model model) {
		User user = new User("Andres", "Rodri");
		model.addAttribute("title","Hola Mundo Spring Boot");
		model.addAttribute("user",user);
		
		
		
		return "details";
	}
	
	
	//Opcion de hacerlo con map

	/*	@GetMapping("/details")
	public String details(Map<String, Object> model) {
		
		model.put("title","Hola Mundo Spring Boot");
		model.put("name","Javier");
		model.put("lastname","Rodri");
		
		
		return "details";
	}
	
	 * 
	 */

	
}
