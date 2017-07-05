package com.cinema.rest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.beans.Movie;
import com.cinema.beans.Showtime;
import com.cinema.service.CinemaService;

@RestController
public class MovieController {
	 @Autowired
    private CinemaService userService;
    
    @PostMapping
    @RequestMapping("/movies.do")
    public @ResponseBody List<Movie> getMovies() {
    	return userService.getAllMovies();
    } 
    
    @PostMapping
    @RequestMapping("/addmovie.do")
    public @ResponseBody Movie addMovies(@RequestBody String movie) {
    	JSONParser parser = new JSONParser();
    	Movie m = new Movie();
    	
    	try{
            Object obj = parser.parse(movie);
            
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            Long id = (Long) jsonObject.get("id");
            Long length = (Long) jsonObject.get("length");
            String title = (String) jsonObject.get("title");
            String imageUrl = (String) jsonObject.get("imageUrl");
            
            JSONArray info = (JSONArray) jsonObject.get("showtimes");
            List<Showtime> showtimes = new ArrayList<Showtime>();
            Iterator<String> iterator = info.iterator();
            while (iterator.hasNext()) {
            	Showtime st1 = new Showtime(iterator.next(), LocalDate.now());
                showtimes.add(st1);
            }
            
            m = new Movie(id.intValue(), title, length.intValue(), showtimes, imageUrl);
            userService.createMovie(m);

         }catch(ParseException pe){
   		
            System.out.println("position: " + pe.getPosition());
            
         }
    	return m;
    } 
    
    @PostMapping
    @RequestMapping("/removemovie.do")
    public @ResponseBody Boolean removeMovie(@RequestBody String id) {
    	userService.deleteMovie(Integer.parseInt(id));
    	return true;
    }
}
