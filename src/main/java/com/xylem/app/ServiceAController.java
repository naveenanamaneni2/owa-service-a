package com.xylem.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ServiceAController {

	@GetMapping("/hello")
	public String sayHello() {
		log.info("Printing message ....");
		return "Hello Kubernetes .. You make Life easy ";
	}
}
