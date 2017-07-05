package com.cinema.dao;

import java.util.List;


import com.cinema.beans.Concession;
import com.cinema.beans.Movie;
import com.cinema.beans.Receipt;
import com.cinema.beans.RewardStatus;
import com.cinema.beans.Room;
import com.cinema.beans.Showtime;
import com.cinema.beans.User;

public interface Dao {

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createUser(com.revature.beans.User)
	 */
	void createUser(User user);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateUser(com.revature.beans.User)
	 */
	void updateUser(User user);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getUsers(com.revature.beans.User)
	 */
	List<User> getUsers();

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getUserByUserId(com.revature.beans.User)
	 */
	User getUserByUserId(int id);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getUserByEmail(com.revature.beans.User)
	 */
	User getUserByEmail(String email);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createMovie(com.revature.beans.Movie)
	 */
	void createMovie(Movie mvoie);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateMovie(com.revature.beans.Movie)
	 */
	void updateMovie(Movie mvoie);
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#deleteMovie(com.revature.beans.Movie)
	 */
	void deleteMovie(Movie mvoie);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getMovies(com.revature.beans.Movie)
	 */
	List<Movie> getMovies();

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getMovieByMovieId(com.revature.beans.Movie)
	 */
	Movie getMovieByMovieId(int id);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getMovieByMovieTitle(com.revature.beans.Movie)
	 */
	Movie getMovieByMovieTitle(String title);
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createReceipt(com.revature.beans.Receipt)
	 */
	void createReceipt(Receipt receipt);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateReceipt(com.revature.beans.Receipt)
	 */
	void updateReceipt(Receipt receipt);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getgetReceiptsByConfNum(com.revature.beans.Receipt)
	 */
	Receipt getReceiptsByConfNum(String confNum);
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getReceiptsByUserId(com.revature.beans.Receipt)
	 */
	List<Receipt> getReceiptsByUserId(int id);
	
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getReceipts()
	 */
	List<Receipt> getReceipts();

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createConcession(com.revature.beans.Concession)
	 */
	void createConcession(Concession concession);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateConcession(com.revature.beans.Concession)
	 */
	void updateConcession(Concession concession);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessionByName(com.revature.beans.Concession)
	 */
	Concession getConcessionByName(String name);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessions(com.revature.beans.Concession)
	 */
	List<Concession> getConcessions();

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createRoom(com.revature.beans.Room)
	 */
	void createRoom(Room room);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateRoom(com.revature.beans.Room)
	 */
	void updateRoom(Room room);
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessionByName(java.lang.String)
	 */
	public Room getRoomByRoomNum(int roomNum);
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessions()
	 */
	public List<Room> getRooms();

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#createShowtime(com.revature.beans.Showtime)
	 */
	void createShowtime(Showtime show);

	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#updateShowtime(com.revature.beans.Showtime)
	 */
	void updateShowtime(Showtime show);
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessionByName(java.lang.String)
	 */
	public Showtime getShowtimeByShowtimeId(int id);
	
	/* (non-Javadoc)
	 * @see com.revature.dao.Dao#getConcessions()
	 */
	public List<Showtime> getShowtimes();
}