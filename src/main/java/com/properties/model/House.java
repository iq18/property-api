package com.properties.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class House {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int house_id;
	
	private String addressOne;
	private String addressTwo;
	private String city ;
	private String county ;
	private double size;
	private double price ;
	
	public House() {
	}

	public House(int house_id, String addressOne, String addressTwo, String city, String county, double size,
				 double price) {
		
		this.house_id = house_id;
		this.addressOne = addressOne;
		this.addressTwo = addressTwo;
		this.city = city;
		this.county = county;
		this.size = size;
		this.price = price;
	}

	public House(String addressOne, String addressTwo, String city, String county, double size, double price) {
		this.addressOne = addressOne;
		this.addressTwo = addressTwo;
		this.city = city;
		this.county = county;
		this.size = size;
		this.price = price;
	}

	public int getHouse_id() {
		return house_id;
	}

	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}

	public String getAddressOne() {
		return addressOne;
	}

	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}

	public String getAddressTwo() {
		return addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "House [house_id=" + house_id + ", addressOne=" + addressOne + ", addressTwo=" + addressTwo + ", city="
				+ city + ", county=" + county + ", size=" + size + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
