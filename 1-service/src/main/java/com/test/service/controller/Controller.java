package com.test.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping
	public String hello() {
		return "Hello from 1-service";
	}
}
