package com.edu.multicampus.Model;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name="hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long hotelId;
	
	@Column(name="hotelName",nullable=false)
	private String hotelName;
	
	@Column(name="hotelLocation",nullable=false)
	private String hotelLocation;
	
	@OneToMany(mappedBy="hotel")
	@JsonIgnore
	private List<HotelRating> hotelrating;
	
	@OneToMany(mappedBy="hotel")
	@JsonIgnore
	private List<Room> room;
	
	@OneToMany(mappedBy="hotel")
	@JsonIgnore
	private List<Staff> staff;
}
