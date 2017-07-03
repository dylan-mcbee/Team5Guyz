package com.cinema.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.beans.Movie;
import com.cinema.service.CinemaService;

@RestController
public class MovieController {
	 @Autowired
    private CinemaService userService;
    
    @PostMapping
    @RequestMapping("/movies.do")
    public @ResponseBody List<Movie> getMovies() {
//    	System.out.println("Movies CONTROLLER");
//    	System.out.println("User: " + userService.login(user));
//        return userService.login(user);
//    	List<Movie> movies = userService.getAllMovies();
//    	movies.forEach(m -> System.out.println(m));
//    	return movies;
    	return userService.getAllMovies();
    } 
}
