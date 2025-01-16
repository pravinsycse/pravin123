package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class welcome {
	@GetMapping(value = "/one")
	public String frontpage() {
		System.out.println("hi welcome to SBMS");
		return "NewFile";
	}
	

}
