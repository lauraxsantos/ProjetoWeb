package com.packt.cardatabase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String brand, model, color, registerNumber;
	private int year, price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Owner")
	private Owner owner;
	
	public Car() {}

	public Car(String brand, String model, String color, String registerNumber, int year, int price, Owner owner) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registerNumber = registerNumber;
		this.year = year;
		this.price = price;
		this.owner = owner;
		
	}
	
	public Owner getOwner() {
		return owner;
	}
	
	public void SetOwner(Owner owner) {
		this.owner = owner;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String color() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getRegisterNumber() {
		return this.registerNumber;
	}
	
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getPrice() {
		return this.price;	
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
