package com.cinema.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.beans.User;
import com.cinema.service.CinemaService;

@CrossOrigin
@RestController
public class LoginController {
    @Autowired
    private CinemaService userService;
    //@RequestMapping(value = "/login.do", method = RequestMethod.POST)
    // This can be done but is best practice to have a Controller for each view.
    
    @PostMapping
    @RequestMapping("/login.do")
    public @ResponseBody User login(@RequestBody User user) {
    	//System.out.println("LOGIN CONTROLLER");
    	//System.out.println("Cred: " + user);
    	//System.out.println("User: " + userService.login(user));
        return userService.login(user);
    } 
}