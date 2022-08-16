package com.edu.multicampus.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long customerId;
	
	@Column(name="customername",nullable=false)
	private String customerName;
	
	@Column(name="customeremail",nullable=false)
	private String customerEmail;
	
	@Column(name="customeruserName",nullable=false)
	private String customerUserName;
	
	@Column(name="customerpassword",nullable=false)
	private String customerPassword;
	

	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private List<Borrows> borrow;
	

	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private List<Orders> order;
	
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private List<HotelRating> hotelrating;
	
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private List<RoomRating> roomrating;
	
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private List<Bill> bill;
}
