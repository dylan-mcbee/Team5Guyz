package com.cinema.request;

import javax.servlet.http.HttpServletRequest;

import com.cinema.controller.LoginController;

public class RequestHelper {
	public String process(HttpServletRequest request){
		switch(request.getRequestURI()){
		case "/Cinema/login.go":
			return LoginController.login(request);
		default:
			return "";
		}
	}

}
