package com.dataforge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAutheticationController {

	@GetMapping("/home")
	public String home() {

		String home = "Welcome to  Home Page";
		return home;
	}

	@GetMapping("/contact")
	public String contact() {
		String contact = "welcome to contact page" + "91+ 99166587611";
		return contact;
	}

	@GetMapping("/msg")
	public String message() {

		String msg = "welcome to message access";
		return msg;
	}
}
