package com.cinema.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ROOM_NUMBER")
	private Room room;
	
	public Showtime() {}
	
	public Showtime(int id, LocalDateTime time, LocalDate date, Room room) {
		super();
		this.id = id;
		this.time = time;
		this.date = date;
		this.room = room;
	}

	public Showtime( LocalDateTime time, LocalDate date, int seatsLeft, Room room) {
		super();
		this.time = time;
		this.date = date;
		this.seatsLeft = seatsLeft;
		this.room = room;
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
	
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Showtime [id=" + id + ", time=" + time + ", date=" + date + ", seatsLeft=" + seatsLeft + ", room="
				+ room + "]\n";
	}
}
