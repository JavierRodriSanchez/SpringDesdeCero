package com.example.ProyectoSpring2MVC.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.ProyectoSpring2MVC.models.User;

@Controller
public class UserController {

	@GetMapping("/details")
	public String details(Model model) {
		User user = new User("Andres", "Rodri");
		user.setEmail("juan@gmail.com");
		model.addAttribute("title", "Hola Mundo Spring Boot");
		model.addAttribute("user", user);

		return "details";
	}

	// Opcion de hacerlo con map

	/*
	 * @GetMapping("/details") public String details(Map<String, Object> model) {
	 * 
	 * model.put("title","Hola Mundo Spring Boot"); model.put("name","Javier");
	 * model.put("lastname","Rodri");
	 * 
	 * 
	 * return "details"; }
	 * 
	 * 
	 */

	@GetMapping("/list")
	public String list(ModelMap model) {

		List<User> users = Arrays.asList(new User("peppa", "pig"), new User("peppa", "pig"),
				new User("Juan", "Jimenez"),new User("Andres","Doe"));

		model.addAttribute("users", users);
		model.addAttribute("title", "Listado de usuarios");

		return "list";
	}

	@ModelAttribute("users")
	public List<User> UserModel(){

		List<User> users = Arrays.asList(new User("peppa", "pig"), new User("peppa", "pig"),
				new User("Juan", "Jimenez"),new User("Andres","Doe"));

		

		return users;
		
	}
	
	
	
}
