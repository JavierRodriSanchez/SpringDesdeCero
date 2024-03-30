package com.example.ProyectoSpring2MVC.models.dto;

public class ParamDto {

	
	private String message;

	public ParamDto(String message) {
		super();
		this.message = message;
	}

	public ParamDto() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
