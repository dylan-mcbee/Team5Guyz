package com.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.beans.Concession;
import com.cinema.beans.Movie;
import com.cinema.beans.Receipt;
import com.cinema.beans.User;
import com.cinema.dao.Dao;
@Service("cinemaService")
public class CinemaService {

	//Dao dao = new DaoHibernateImpl();
	@Autowired
	private Dao dao;


	public User login(User user){
//		User u = dao.getUserByEmail(user.getEmail());
//		if(u.getPassword()==user.getPassword())
//		{
//			return dao.getUserByEmail(user.getEmail());
//		}
//		System.out.println("Login Failed");
//		return new User();
		System.out.println("Email: " + user.getEmail());
		return dao.getUserByEmail(user.getEmail());
		
	}
	
	
	public void createUser(User user){
		dao.createUser(user);
		System.out.println(user.getFirstName() +" "+user.getLastName() +" has been created");
	}

	public void updateUser(User user){
		dao.updateUser(user);
		System.out.println(user.getFirstName()+ " "+ user.getLastName()+" updated");
	}

	public List <User> getUsers(){
		return dao.getUsers();
	}

	public User getUserByEmail(String email){
		return dao.getUserByEmail(email);
	}

	public void createMovie(Movie movie){
		dao.createMovie(movie);
		System.out.println(movie.getTitle()+" has been created");
	}

	public void updateMovie(Movie movie){
		  dao.updateMovie(movie);
		  System.out.println();
	}

	public Movie getMovieByMovieId(int id){
		return dao.getMovieByMovieId(id);
	}

	public Movie getMovieByMovieTitle(String title){
		return dao.getMovieByMovieTitle(title);
	}

	public void createConcession(Concession concession){
		dao.createConcession(concession);
		System.out.println(concession.getName() +" has been created");
		
	}

	public void updateConcession(Concession concession){
		 dao.updateConcession(concession);
		 System.out.println(concession.getName()+" has been updated");
	}

	public Concession getConcession(String name){
		return dao.getConcessionByName(name);

	}

	public List<Concession>  getConcessions(){
		return dao.getConcessions();
	}

	public void createReceipt(Receipt receipt){
		dao.createReceipt(receipt);
		System.out.println("Confirmation Number "+receipt.getConfirmationNumber());
	}

	public void updateReceipt(Receipt receipt){
		dao.updateReceipt(receipt);
		System.out.println("Receipt# "+receipt.getConfirmationNumber()+" :updated");
	}

	public List<Movie> getAllMovies() {
		return dao.getMovies();
	}
	
	public void deleteMovie(int id) {
		Movie movie = new Movie();
		movie.setId(id);
		dao.deleteMovie(movie);
	}
}
