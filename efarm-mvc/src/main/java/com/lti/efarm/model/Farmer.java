package com.lti.efarm.model;

import javax.persistence.*;

@Entity
@Table(name="farmer_personal_details")
public class Farmer
{
	
	@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="farmid_generator")
@SequenceGenerator(name="farmid_generator",sequenceName="farmer_details100",allocationSize=1)
@PrimaryKeyJoinColumn
private int farmer_id;
	
	
	private String fullname;
	private String email_id;
	private int contact;
	
	@Column(insertable=false, updatable=false, nullable=false)
	private int address_id;
	
		//private  String address_id;
			
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;

	
	
	//public int getAddress_id() {
	//	return address_id;
//	}

	//public void setAddress_id(int address_id) {
	//	this.address_id = address_id;
//	}

	public int getFarmer_id() {
		return farmer_id;
	}

	public void setFarmer_id(int farmer_id) {
		this.farmer_id = farmer_id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
		
}


