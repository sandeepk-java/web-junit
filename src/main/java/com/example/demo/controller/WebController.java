package com.example.demo.controller;

import javax.validation.Valid;

import org.junit.jupiter.api.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.User;


@RestController
@RequestMapping("/user")
public class WebController {
	@PostMapping("/registration")
	//@RequestMapping(value = "/registration", method= RequestMethod.POST)
	public String registeration(@RequestBody User user){
	    System.out.println("inside registration controller");
	    return "registration successfully";
	}
	@PostMapping("/register")
	//@RequestMapping(value = "/registration", method= RequestMethod.POST)
	public ResponseEntity<User> register(@RequestBody @Valid User user){
	    System.out.println("inside registration controller");
	    return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping("/login")
	//@RequestMapping(value = "/registration", method= RequestMethod.POST)
	public ResponseEntity<String> login(){
	    System.out.println("inside login controller");
	    return new ResponseEntity<String>("registration successfully",HttpStatus.OK);
	}

}
