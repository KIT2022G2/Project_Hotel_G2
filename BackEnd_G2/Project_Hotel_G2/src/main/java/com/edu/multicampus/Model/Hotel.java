package com.edu.multicampus.Model;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
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
	
	@OneToMany(mappedBy="hotel")
	private List<HotelRating> hotelrating;
	
	@OneToMany(mappedBy="hotel")
	private List<Room> room;
	
	@OneToMany(mappedBy="hotel")
	private List<Staff> staff;
}
