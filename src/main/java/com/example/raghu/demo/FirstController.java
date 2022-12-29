package com.example.raghu.demo;
	
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class FirstController  {
	static Logger logger = (Logger) LoggerFactory.getLogger(DemoApplication.class);
	@GetMapping("/hello")
	public String hello() {
		logger.debug("HELLO DEBUG RAGHU AGAIN. CHECK THIS ONCE");
		return "HELLO RAGHU VARDHAN. THIS IS COMING FROM KUBERNETES CLUSTER";
	}
}
