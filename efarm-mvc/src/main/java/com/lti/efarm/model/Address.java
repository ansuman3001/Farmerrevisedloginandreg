package com.lti.efarm.model;

import javax.persistence.*;


@Entity
@Table(name="farmer_address_details")
public class Address 
{
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "address_id")
	private int address_id;
	 
	 
	private String house_no, city, state, country;
	private int pin_code;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Farmer farmer;
	
	public Farmer getFarmer() {
		return farmer;
	}
	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin_code() {
		return pin_code;
	}
	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}
	
	
	
	
	



}
