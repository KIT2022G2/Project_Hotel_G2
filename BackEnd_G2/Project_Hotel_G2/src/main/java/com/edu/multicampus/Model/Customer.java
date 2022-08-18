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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long customerId;
	
	@Column(name="customerName",nullable=false)
	private String customerName;
	
	@Column(name="customerEmail",nullable=false)
	private String customerEmail;
	
	@Column(name="customerUserName",nullable=false)
	private String customerUserName;
	
	@Column(name="customerPassword",nullable=false)
	private String customerPassword;
	
	@JsonIgnore
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private List<Borrows> borrow;
	
	@JsonIgnore
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private List<Orders> order;
	
	@JsonIgnore
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private List<HotelRating> hotelrating;
	
	@JsonIgnore
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private List<RoomRating> roomrating;
	
	@JsonIgnore
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private List<Bill> bill;
}
