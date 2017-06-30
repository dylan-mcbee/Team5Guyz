package com.cinema.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.beans.User;
import com.cinema.service.Service;

@RestController
@RequestMapping("/login.do")
public class LoginController {
	
	@Autowired
	private Service service;
	
	@PostMapping
	@RequestMapping("/login.do")
	public User login(@RequestBody User user){
		service.login(user.getEmail(), user.getPassword());
	}
	

}
