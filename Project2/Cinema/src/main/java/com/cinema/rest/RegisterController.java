package com.cinema.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.beans.User;
import com.cinema.service.CinemaService;

@RestController
public class RegisterController {
	
	@Autowired
	private CinemaService userservice;
	
	@GetMapping
	@RequestMapping("/register.do")
	public @ResponseBody User register(@RequestBody User u){
		System.out.println("REGISTER HIT: "+u);
		userservice.createUser(u);
		return userservice.getUserByEmail(u.getEmail());
		
	}
	
}
