package com.example.ProyectoSpring2MVC.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoSpring2MVC.models.dto.ParamDto;



@RestController
@RequestMapping("api/params")
public class RequestParamController {

	
	
	
	@GetMapping("/foo")
	public ParamDto foo(@RequestParam(required = false,defaultValue = "HOla") String message) {
		
		ParamDto param = new ParamDto();
		param.setMessage(message);
		
		return param;
		
	}
}
