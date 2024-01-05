package com.example.demo;

public class Calling {
	private Services service;

	public void setService(Services service) {
		this.service = service;
	}
	
	public void service() {
		service.service();
	}
}
