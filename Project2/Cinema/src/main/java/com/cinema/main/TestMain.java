package com.cinema.main;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cinema.beans.Movie;
import com.cinema.beans.Showtime;
import com.cinema.dao.Dao;

public class TestMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Dao dao = (Dao) ac.getBean("cinemaRepository");
		//System.out.println(dao.getUserByEmail("liqunzheng@live.cn"));
		//List<Movie> movies = dao.getMovies();
    	////movies.forEach(m -> System.out.println(m));
		//for(Movie movie : movies) {
			//System.out.println(movie);
		//}
		//System.out.println("Movies: " + movies.get(0));
		
		//System.out.println("Hello");
		
		//System.out.println("Hello");
		
		Showtime st1 = new Showtime("10:00 AM", LocalDate.now());
//		Showtime st2 = new Showtime("2:00 PM", LocalDate.now());
//		Showtime st3 = new Showtime("5:00 PM", LocalDate.now());
//		
//		List<Showtime> sts = new ArrayList<Showtime>();
//		sts.add(st1);
//		sts.add(st2);
//		sts.add(st3);
		
		//Movie m = new Movie(75780, "Jack Reacher", 130, sts, "https://image.tmdb.org/t/p/w500/38bmEXmuJuInLs9dwfgOGCHmZ7l.jpg");
		//Movie m2 = new Movie(126963, "Dragon Ball Z: Battle of Gods", 121, sts, "https://image.tmdb.org/t/p/w500/xI5LlCzSkp8iFSbmla0Dh4iT5ie.jpg");
		//Movie m3 = new Movie(303857, "Dragon Ball Z: Resurrection 'F'", 93, sts, "https://image.tmdb.org/t/p/w500/uYgE4QiNEDNbYTthVH5MJuCIBsX.jpg");
		
		//dao.createMovie(m);
		//dao.createMovie(m2);
		//dao.createMovie(m3);
//
//		List<Concession> con = new ArrayList<Concession>();
//		Concession con = new Concession("popcorn", 8.50);
//		
//		con = dao.getConcessions();
//		System.out.println(con.toString());
//		User u = new User();
	//	Room r = new Room();
//		r = dao.getRoomByRoomNum(1);
		//r.setCapacity(30);
//		dao.updateRoom(r);
//		System.out.println(r.toString());
//		Room r = new Room(1, 30);
//		r = dao.getRoomByRoomNum(1);
//		Room r2 = new Room();
		
//		Room r2 = new Room(2, 35);
//		r2= dao.getRoomByRoomNum(2);
//		dao.createRoom(r);
//		dao.createRoom(r2);
//		Movie m = new Movie();
	
//		List<Movie> m = dao.getMovies();
//		Movie m = dao.getMovieByMovieId(1);
//		List<Showtime> sts = m.getShowtimes();
//		sts.add(dao.getShowtimeByShowtimeId(3));
//		m.setShowtimes(sts);
//		dao.updateMovie(m);
//		System.out.println(m.toString());
//		Showtime st = new Showtime(LocalDateTime.now(), LocalDate.now(), r.getCapacity(), r);
//		dao.createShowtime(st);
//		Showtime st = new Showtime();
//		st = dao.getShowtimeByShowtimeId(4);
//		System.out.println(st.toString());
//		Showtime st1 = new Showtime(LocalDateTime.now(), LocalDate.now(), r2.getCapacity(), r2);
//		dao.createShowtime(st1);
//		Showtime st1 = new Showtime();
//		st1 = dao.getShowtimeByShowtimeId(5);
//		System.out.println(st1.toString());
//		List<Showtime> sts = new ArrayList<Showtime>();
	//	sts.add(st);
//		sts.add(st1);
		
//		Showtime st = dao.getShowtimeByShowtimeId(3);
//		st.setSeatsLeft(st.getSeatsLeft()-1);
//		dao.updateShowtime(st);
//		System.out.println(st.toString());

//		Showtime st = new Showtime( LocalDateTime.now(), LocalDate.now(), r.getCapacity());
		
//		Movie m = new Movie(297762, "Wonder Woman", 141, "junk", sts, "https://image.tmdb.org/t/p/w500/imekS7f1OuHyUP2LAiTEM0zBzUz.jpg");
	//	dao.createMovie(m);
//		m.forEach(mov -> System.out.println("Movie: " + mov));
//		m = dao.getMovieByMovieTitle("time");
//		System.out.println(m.toString());
//		List<User> u = new ArrayList<User>();
//		User u = new User("liqunzheng@live.cn", "liqun", "zheng", "123", RewardStatus.BRONZE,
				//"6452221234", 74, false);
		//dao.createUser(u);
//		u = dao.getUserByUserId(2);
//		u.setFirstName("lee");
//		u.setRewardStatus(RewardStatus.BRONZE);
//		dao.updateUser(u);
//		u = dao.getUsers();
//		u = dao.getUserByEmail("liqunzheng@live.cn");
//		System.out.println(u.toString());
//		System.out.println(st.toString());
//		u = dao.getUserByUserId(2);
//		Receipt re = new Receipt("XEDWEDSVXCE", LocalDate.now(), m.getShowtimes().get(0).getDate(), 7.5,
//				m.getTitle(),m.getShowtimes().get(0).getTime(), u.getphoneNumber(), u);
//		dao.createReceipt(re);
//		Receipt re = dao.getReceiptsByConfNum("XEDWEDSVXCE");
//		re.setPrice(43.4);
//		dao.updateReceipt(re);
//		Receipt re = dao.getReceiptsByConfNum("XEWFDF");
//		Receipt re = dao.getReceiptsByUserId(1);
//		List<Receipt> re = dao.getReceipts();
//		
//		System.out.println(re.toString());
//		dao.deleteMovie(m);
//		System.out.println(m.toString());
		//boolean result = Mail.sendMail("zhengliqun1@gmail.com", "title", "message");
		//System.out.println(result);
	}
}
