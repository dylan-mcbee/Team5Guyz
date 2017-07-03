package com.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cinema.beans.User;
import com.cinema.dao.Dao;
import com.cinema.dao.DaoHibernateImpl;

@Controller
public class MasterController {
	
	Dao dao = new DaoHibernateImpl();
	
	@GetMapping
	@RequestMapping("/login.view")//form action in index.html
	public String getLoginView(){
		System.out.println("MASTER CONTROLLER");
		return "userinfo";//will go to userinfo.html
	}
	
	@GetMapping
	@RequestMapping("/static/movies.view")
	public String getMovieView(){
		System.out.println("MASTER MOVIE CONTROLLER");
		return "../movies";//will go to movies.html
	}
}


