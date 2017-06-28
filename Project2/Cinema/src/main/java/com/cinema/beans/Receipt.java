package com.cinema.beans;



import java.time.LocalDate;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RECEIPT")
public class Receipt implements Serializable {

	@Id
	@Column(name = "CON_NUMBER")
	private String confirmationNumber;

	@Column(name = "PURCHASE_DATE")
	private LocalDate purchaseDate;

	@Column(name = "SHOW_DATE")
	private LocalDate showDate;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "MOVIE_TITLE")
	private String movieTitle;

	@Column(name = "MOVIE_TIME")
	private LocalDate movieTime;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "NUM_TICKETS")
	private int numOfTickets;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
	private User user;

	public Receipt() {

	}

	public Receipt(String confirmationNumber, LocalDate purchaseDate, LocalDate showDate, double price,	String movieTitle, LocalDate movieTime, String phoneNumber, User user) {

		super();
		this.confirmationNumber = confirmationNumber;
		this.purchaseDate = purchaseDate;
		this.showDate = showDate;
		this.price = price;
		this.movieTitle = movieTitle;
		this.movieTime = movieTime;
		this.phoneNumber = phoneNumber;
		this.user = user;

	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public LocalDate getShowDate() {
		return showDate;
	}

	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public LocalDate getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(LocalDate movieTime) {
		this.movieTime = movieTime;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;

	}

	@Override
	public String toString() {
		return "Receipt [confirmationNumber=" + confirmationNumber + ", purchaseDate=" + purchaseDate + ", showDate="
				+ showDate + ", price=" + price + ", movieTitle=" + movieTitle + ", movieTime=" + movieTime
				+ ", phoneNumber=" + phoneNumber + ", userId=" + user + "]";

	}

}
