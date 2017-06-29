package com.cinema.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.cinema.converter.LocalDateAttributeConverter;
import com.cinema.converter.LocalDateTimeAttributeConverter;

@Entity
@Table(name = "SHOWTIME")
public class Showtime implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stSeq")
	@SequenceGenerator(allocationSize = 1, name = "stSeq", sequenceName = "ST_SEQ")
	@Column(name = "SHOWTIME_ID")
	private int id;
	
	@Convert(converter = LocalDateTimeAttributeConverter.class)
	@Column(name = "SHOW_TIME")
	private LocalDateTime time;
	
	@Convert(converter = LocalDateAttributeConverter.class)
	@Column(name = "SHOW_DATE")
	private LocalDate date;
	
	@Column(name = "SEATS_LEFT")
	private int seatsLeft;
	
	public Showtime() {}
	
	public Showtime(int id, LocalDateTime time, LocalDate date) {
		super();
		this.id = id;
		this.time = time;
		this.date = date;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public int getSeatsLeft() {
		return seatsLeft;
	}

	public void setSeatsLeft(int seatsLeft) {
		this.seatsLeft = seatsLeft;
	}

	public LocalDateTime getTime() {
		return time;
	}
	
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Showtime [id=" + id + ", time=" + time + ", date=" + date + ", seatsLeft=" + seatsLeft
				+ "]";
	}
}
