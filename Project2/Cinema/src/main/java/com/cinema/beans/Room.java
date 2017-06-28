package com.cinema.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM")
public class Room implements Serializable {

	@Id
	@Column(name = "ROOM_NUMBER")
	private int roomNumber;

	@Column(name = "CAPACITY")
	private int capacity;

	@Column(name = "SEATS_LEFT")

	private int seatsLeft;

	public Room() {

	}

	public Room(int roomNumber, int capacity, int seatsLeft) {
		super();
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.seatsLeft = seatsLeft;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSeatsLeft() {
		return seatsLeft;
	}

	public void setSeatsLeft(int seatsLeft) {
		this.seatsLeft = seatsLeft;
	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", capacity=" + capacity + ", seatsLeft=" + seatsLeft + "]";
	}

}
