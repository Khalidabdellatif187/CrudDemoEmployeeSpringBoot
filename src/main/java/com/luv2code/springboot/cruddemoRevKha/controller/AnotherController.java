package com.luv2code.springboot.cruddemoRevKha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/put")
@Controller
public class AnotherController {
	
	
	@GetMapping("/rest")
	public String show() {
		
		return "what";
	}
	

}
