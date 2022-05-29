package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "check")
public class RestController {

	@GetMapping
	public String getRequest() {
		return "Hello World";
	}
}
