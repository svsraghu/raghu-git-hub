package com.example.raghu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("/hello")
	public String hello() {
		return "HELLO RAGHU VARDHAN again";
	}
}
