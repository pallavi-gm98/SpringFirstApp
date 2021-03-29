package com.maven.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
	
	@RequestMapping("/Home")
	public String home() {
		return "Welcome to SpringBoot FirstApp";
	}
	@RequestMapping("/About")
	public String about() {
		return "About-us";
	}

}
