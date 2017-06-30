package com.cinema.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.beans.Concession;
import com.cinema.beans.Movie;
import com.cinema.beans.Receipt;
import com.cinema.beans.RewardStatus;
import com.cinema.beans.Room;
import com.cinema.beans.Showtime;
import com.cinema.beans.User;

@Transactional
public class DaoHibernateImpl implements Dao {
	private SessionFactory sessionFactory;


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createUser(com.revature.beans.User)
	 */
	public void createUser(User user) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.save(user);
	
	}

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateUser(com.revature.beans.User)
	 */
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.update(user);
	}
	


	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getUsers()
	 */
	public List<User> getUsers(){
		Session s = sessionFactory.getCurrentSession();
		List<User> users = new ArrayList<User>();
		users = s.createQuery("from User").list();
		return users;
	}

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getUserByUserId(int)
	 */
	public User getUserByUserId(int id){
		Session s = sessionFactory.getCurrentSession();
		User temp = new User();
		Criteria cri = s.createCriteria(User.class).add(Restrictions.like("id", id));
		temp = (User) cri.list().get(0);
		return temp;
	}

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getUserByEmail(java.lang.String)
	 */
	public User getUserByEmail(String email){
		Session s = sessionFactory.getCurrentSession();
		User temp = new User();
		Criteria cri = s.createCriteria(User.class).add(Restrictions.like("email", email));
		temp = (User) cri.list().get(0);
		return temp;
	}

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createMovie(com.revature.beans.Movie)
	 */
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void createMovie(Movie movie) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(movie.getShowtimes());
		s.save(movie);
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateMovie(com.revature.beans.Movie)
	 */
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(movie.getShowtimes());
		s.update(movie);
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateMovie(com.revature.beans.Movie)
	 */
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void deleteMovie(Movie movie){
		Session s = sessionFactory.getCurrentSession();
		s.delete(movie);
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getMovies()
	 */
	public List<Movie> getMovies(){
		Session s = sessionFactory.getCurrentSession();
		List<Movie> movies = new ArrayList<Movie>();
		movies = (List<Movie>) s.createQuery("from Movie").list();
		return movies;
	}
	

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getMovieByMovieId(int)
	 */
	public Movie getMovieByMovieId(int id){
		Session s = sessionFactory.getCurrentSession();
		Movie temp = new Movie();
		Criteria cri = s.createCriteria(Movie.class).add(Restrictions.like("id", id));
		temp = (Movie) cri.list().get(0);
		return temp;
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getMovieByMovietitle(int)
	 */
	public Movie getMovieByMovieTitle(String title){
		Session s = sessionFactory.getCurrentSession();
		Movie temp = new Movie();
		Criteria cri = s.createCriteria(Movie.class).add(Restrictions.like("title", title));
		temp = (Movie) cri.list().get(0);
		return temp;
	}

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createReceipt(com.revature.beans.Receipt)
	 */
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void createReceipt(Receipt receipt) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(receipt.getUser());
		s.save(receipt);
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateReceipt(com.revature.beans.Receipt)
	 */
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void updateReceipt(Receipt receipt) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(receipt.getUser());
		s.update(receipt);

	}

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getReceiptsByUserId(int)
	 */
	public Receipt getReceiptsByConfNum(String confNum){
		Session s = sessionFactory.getCurrentSession();
		Receipt receipt = new Receipt();
		Criteria cri = s.createCriteria(Receipt.class).add(Restrictions.like("confirmationNumber", confNum));
		receipt = (Receipt) cri.list().get(0);
		return receipt;
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getReceiptsByUserId(int)
	 */
	public List<Receipt> getReceiptsByUserId(int id){
		Session s = sessionFactory.getCurrentSession();
		List<Receipt> receipts = new ArrayList<Receipt>();
		Criteria cri = s.createCriteria(Receipt.class).add(Restrictions.like("user", new User(id)));
		receipts = (List<Receipt>) cri.list();
		return receipts;
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getReceipts()
	 */
	public List<Receipt> getReceipts(){
		Session s = sessionFactory.getCurrentSession();
		List<Receipt> receipts = new ArrayList<Receipt>();
		receipts = (List<Receipt>) s.createQuery("from Receipt").list();
		return receipts;
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createConcession(com.revature.beans.Concession)
	 */
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void createConcession(Concession concession) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.save(concession);
	}

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateConcession(com.revature.beans.Concession)
	 */
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void updateConcession(Concession concession) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.update(concession);
	}

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessionByName(java.lang.String)
	 */
	public Concession getConcessionByName(String name){
		Session s = sessionFactory.getCurrentSession();
		
			Concession temp = new Concession();
			Criteria cri = s.createCriteria(Concession.class).add(Restrictions.like("name", name));
			temp = (Concession) cri.list().get(0);
			return temp;

	}

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessions()
	 */
	public List<Concession> getConcessions(){
		Session s = sessionFactory.getCurrentSession();
		List<Concession> concessions = new ArrayList<Concession>();
		concessions = s.createQuery("from Concession").list();
		return concessions;
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createRoom(com.revature.beans.Room)
	 */
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void createRoom(Room room) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.save(room);

	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateRoom(com.revature.beans.Room)
	 */
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.update(room);

	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessionByName(java.lang.String)
	 */

	public Room getRoomByRoomNum(int roomNum){
		Session s = sessionFactory.getCurrentSession();
		Room temp = new Room();
		Criteria cri = s.createCriteria(Room.class).add(Restrictions.like("roomNumber", roomNum));
		temp = (Room) cri.list().get(0);
		return temp;

	}

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessions()
	 */
	public List<Room> getRooms(){
		Session s = sessionFactory.getCurrentSession();
		List<Room> rooms = new ArrayList<Room>();
		rooms = s.createQuery("from Room").list();
		return rooms;
	}
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createShowtime(com.revature.beans.Showtime)
	 */
	public void createShowtime(Showtime show){
		Session s = sessionFactory.getCurrentSession();
		s.save(show);
	}

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateShowtime(com.revature.beans.Showtime)
	 */
	public void updateShowtime(Showtime show){
		Session s = sessionFactory.getCurrentSession();
		s.update(show);
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessionByName(java.lang.String)
	 */
	public Showtime getShowtimeByShowtimeId(int id){
		Session s = sessionFactory.getCurrentSession();
		Showtime temp = new Showtime();
		Criteria cri = s.createCriteria(Showtime.class).add(Restrictions.like("id", id));
		temp = (Showtime) cri.list().get(0);
		return temp;
	}
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessions()
	 */
	public List<Showtime> getShowtimes(){
		Session s = sessionFactory.getCurrentSession();
		List<Showtime> shows = new ArrayList<Showtime>();
		shows = s.createQuery("from Showtime").list();
		return shows;
	}

}
