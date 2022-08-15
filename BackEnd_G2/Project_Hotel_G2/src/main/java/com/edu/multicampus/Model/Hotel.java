package com.edu.multicampus.Model;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long hotelId;
	
	@Column(name="hotelname",nullable=false)
	private String hotelName;
	
	@Column(name="hotellocation",nullable=false)
	private String hotelLocation;
	
	@Column(name="codehotel",nullable =true, unique=true)
	private String codeHotel;
	
	@OneToMany(mappedBy="hotelrating")
	private List<HotelRating> hotelrating;
	
	@OneToMany(mappedBy="room")
	private List<Room> room;
	
}
