package com.Suresh.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String greet() {
		String portNumber = env.getProperty("server.port");
		return "Good Morning" + portNumber + "is running ";
	}
	
}
