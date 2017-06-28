package com.cinema.beans;

import java.time.LocalDate;
import java.util.ArrayList;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE")
public class Movie implements Serializable {

	@Id
	@Column(name = "MOVIE_ID")
	private int id;

	@Column(name = "MOVIE_TITLE")
	private String title;

	@Column(name = "MOVIE_LENGTH")
	private LocalDate length;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "MOVIE_DATES", joinColumns = @JoinColumn(name = "MOVIE_ID"), inverseJoinColumns = @JoinColumn(name = "MOVIE_DATE"))
	private Set<LocalDate> movieDates;

	@JoinTable(name = "MOVIE_TIMES", joinColumns = @JoinColumn(name = "MOVIE_ID"), inverseJoinColumns = @JoinColumn(name = "MOVIE_TIME"))
	private Set<LocalDate> showTimes;

	public Movie() {

	}

	public Movie(int id, String title, LocalDate length, Set<LocalDate> movieDates, Set<LocalDate> showTimes) {

		super();
		this.id = id;
		this.title = title;
		this.length = length;
		this.movieDates = movieDates;
		this.showTimes = showTimes;
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

	public LocalDate getLength() {
		return length;
	}

	public void setLength(LocalDate length) {
		this.length = length;
	}

	public Set<LocalDate> getMovieDates() {
		return movieDates;
	}

	public void setMovieDates(Set<LocalDate> movieDates) {
		this.movieDates = movieDates;
	}

	public Set<LocalDate> getShowTimes() {
		return showTimes;
	}

	public void setShowTimes(Set<LocalDate> showTimes) {

		this.showTimes = showTimes;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", length=" + length + ", movieDates=" + movieDates
				+ ", showTimes=" + showTimes + "]";
	}

}
