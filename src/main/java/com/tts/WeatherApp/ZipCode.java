package com.tts.WeatherApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ZipCode {
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String code;
	
	public ZipCode() {
		super();
	}

	public ZipCode(String code) {
		super();
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
