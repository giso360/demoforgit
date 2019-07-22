package com.example.demoforgit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CC {

	@GetMapping("/")
	public String n(){
		return "Hello MM";
	}
}
