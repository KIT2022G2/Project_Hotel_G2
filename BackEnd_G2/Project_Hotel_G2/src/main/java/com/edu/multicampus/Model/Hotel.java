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
	
	public Hotel() {
		super();
	}

	public Hotel(Long hotelId, String hotelName, String hotelLocation, List<HotelRating> hotelrating, List<Room> room,
			List<Staff> staff) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		this.hotelrating = hotelrating;
		this.room = room;
		this.staff = staff;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public List<HotelRating> getHotelrating() {
		return hotelrating;
	}

	public void setHotelrating(List<HotelRating> hotelrating) {
		this.hotelrating = hotelrating;
	}

	public List<Room> getRoom() {
		return room;
	}

	public void setRoom(List<Room> room) {
		this.room = room;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	@OneToMany(mappedBy="hotel")
	private List<HotelRating> hotelrating;
	
	@OneToMany(mappedBy="hotel")
	private List<Room> room;
	
	@OneToMany(mappedBy="hotel")
	private List<Staff> staff;
}
