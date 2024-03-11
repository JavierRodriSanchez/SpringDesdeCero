package com.example.ProyectoSpring2MVC.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

	
	@GetMapping("/details")
	public String details(Model model) {
		
		model.addAttribute("title","Hola Mundo Spring Boot");
		model.addAttribute("name","Javier");
		model.addAttribute("lastname","Rodri");
		
		
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
