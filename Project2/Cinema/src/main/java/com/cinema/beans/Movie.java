package com.cinema.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE")
public class Movie implements Serializable {

	@Id
	@Column(name = "MOVIE_ID")
	private int id;
	
	@Column(name = "MOVIE_TITLE", unique = true)
	private String title;
	
	@Column(name = "MOVIE_LENGTH")
	private int length;
	
	@Column(name = "TRAILER_KEY")
	private String trailerKey;
	
	
//	@ElementCollection
//	private Set<int> movieints = new HashSet<int>();
//	
//	@ElementCollection
//	private Set<int> showTimes = new HashSet<int>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "MOVIE_TIMES", 
		joinColumns = { @JoinColumn(name = "MOVIE_ID") }, 
		inverseJoinColumns = { @JoinColumn(name = "SHOWTIME_ID") })
	private List<Showtime> showtimes;
	
	public Movie(){
		
	}
	
	public Movie(int id, String title, int length, String trailerKey, List<Showtime> showtimes) {
		super();
		this.id = id;
		this.title = title;
		this.length = length;
		this.trailerKey = trailerKey;
		this.showtimes = showtimes;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getTrailerKey() {
		return trailerKey;
	}

	public void setTrailerKey(String trailerKey) {
		this.trailerKey = trailerKey;
	}


	public List<Showtime> getShowtimes() {
		return showtimes;
	}

	public void setShowtimes(List<Showtime> showtimes) {
		this.showtimes = showtimes;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", length=" + length + ", trailerKey=" + trailerKey
				 + ", showtimes=" + showtimes + "]\n";
	}
}
