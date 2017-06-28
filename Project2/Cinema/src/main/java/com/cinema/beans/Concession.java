package com.cinema.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONCESSION")
public class Concession implements Serializable {

	@Id
	@Column(name="NAME")
	private String name;
	
	@Column(name="PRICE")
	private double price;
	
	public Concession(){
		
	}

	public Concession(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Concession [name=" + name + ", price=" + price + "]";
	}
	
}
