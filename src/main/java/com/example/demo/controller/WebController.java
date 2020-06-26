package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.User;

@RestController
@RequestMapping("/user")
public class WebController {
	
	@PostMapping("/registration")
	public String registeration(@RequestBody User user) {
		
		System.out.println("inside registration controller");
		return "registration successfully";
	}

	@PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody @Valid User user) {
		
		System.out.println("inside registration controller");
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@GetMapping("/login")
	public ResponseEntity<String> login() {
		
		System.out.println("inside login controller");
		return new ResponseEntity<String>("registration successfully", HttpStatus.OK);
	}

}
