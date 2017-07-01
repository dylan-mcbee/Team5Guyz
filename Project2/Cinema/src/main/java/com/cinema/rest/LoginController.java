package com.cinema.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.cinema.beans.User;
import com.cinema.service.CinemaService;

@RestController
public class LoginController {
    @Autowired
    private CinemaService userService;
    //@RequestMapping(value = "/login.do", method = RequestMethod.POST)
    // This can be done but is best practice to have a Controller for each view.
    @PostMapping
    @RequestMapping("/login.do")
    public @ResponseBody User login(@RequestBody User user) {
        return userService.login(user);
    } 
}