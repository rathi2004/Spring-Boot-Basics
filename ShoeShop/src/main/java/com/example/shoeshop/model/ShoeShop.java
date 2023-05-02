package com.example.shoeshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shoedetails")
public class ShoeShop {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="brand",nullable=false)
	private String brand;
	
	@Column(name="model",nullable=false)
	private String model;
	
	@Column(name="size",nullable=false)
	private int size;
	
	@Column(name="prize",nullable=false)
	private int prize;
	
	@Column(name="meterial",nullable=false)
	private String meterial;
	
	@Column(name="gender",nullable=false)
	private String gender;
	
	@Column(name="color",nullable=false)
	private String color;
	
	ShoeShop(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getMeterial() {
		return meterial;
	}

	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}

