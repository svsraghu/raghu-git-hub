package com.example.raghu.demo;
	
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class FirstController  {
	static Logger logger = (Logger) LoggerFactory.getLogger(DemoApplication.class);
	
	
	@GetMapping("/raghu")
	public String raghu() {
		logger.debug("HELLO RAGHU AGAIN. YOU ARE ADMIN");
		return "HELLO RAGHU VARDHAN. YOU ARE ADMIN";
	}
	
	@GetMapping("/vardhan")
	public String vardhan() {
		logger.debug("HELLO VARDHAN. YOU ARE USER");
		return "HELLO RAGHU VARDHAN. YOU ARE USER";
	}
}
