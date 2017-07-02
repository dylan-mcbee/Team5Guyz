package com.cinema.controller;

<<<<<<< HEAD


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
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	
	@RequestMapping("/login.view")
	public @ResponseBody String getLoginView(){
		return "login";
>>>>>>> 8805d60bbfe8d0e09199d9738926012d8f379d57
	}
	

}
