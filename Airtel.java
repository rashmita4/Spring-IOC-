package com.example.practice1;

public class Airtel {
	
	private Service service;

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	public void airtelSer() {
		service.service();
	}

}
