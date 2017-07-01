package com.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MasterController {
	
	@GetMapping
	@RequestMapping("/login.view")
	public @ResponseBody String getLoginView(){
		return "login";
	}
	
	}


