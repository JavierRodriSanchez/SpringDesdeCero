package com.example.ProyectoSpring1.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/app/foo")
	public Map<String, Object> foo() {
		Map<String, Object> json = new HashMap<String, Object>();
		json.put("message", "Hola mundo spring boot");
		json.put("date", new Date().toString());

		return json;
	}
}
