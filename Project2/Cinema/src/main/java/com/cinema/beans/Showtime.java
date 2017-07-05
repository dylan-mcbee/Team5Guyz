package com.cinema.beans;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.cinema.converter.LocalDateAttributeConverter;

@Entity
@Table(name = "SHOWTIME")
public class Showtime implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stSeq")
	@SequenceGenerator(allocationSize = 1, name = "stSeq", sequenceName = "ST_SEQ")
	@Column(name = "SHOWTIME_ID")
	private int id;
	
	@Column(name = "SHOW_TIME")
	private String time;
	
	@Convert(converter = LocalDateAttributeConverter.class)
	@Column(name = "SHOW_DATE")
	private LocalDate date;
	
//	@Column(name = "SEATS_LEFT")
//	private int seatsLeft;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "ROOM_NUMBER")
//	private Room room;
	
	public Showtime() {}
	
	public Showtime(int id, String time, LocalDate date) {
		super();
		this.id = id;
		this.time = time;
		this.date = date;
	}

	public Showtime( String time, LocalDate date) {
		super();
		this.time = time;
		this.date = date;
	}
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

//	public int getSeatsLeft() {
//		return seatsLeft;
//	}
//
//	public void setSeatsLeft(int seatsLeft) {
//		this.seatsLeft = seatsLeft;
//	}

	public String  getTime() {
		return time;
	}
	
	public void setTime(String  time) {
		this.time = time;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
//	public Room getRoom() {
//		return room;
//	}
//
//	public void setRoom(Room room) {
//		this.room = room;
//	}

	@Override
	public String toString() {
		return "Showtime [id=" + id + ", time=" + time + ", date=" + date + "]\n";
	}
}
