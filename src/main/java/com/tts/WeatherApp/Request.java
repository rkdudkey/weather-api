package com.tts.WeatherApp;

public class Request {
	
	private String zipCode;

	public Request() {
		super();
	}

	public Request(String zipCode) {
		super();
		this.zipCode = zipCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
}
