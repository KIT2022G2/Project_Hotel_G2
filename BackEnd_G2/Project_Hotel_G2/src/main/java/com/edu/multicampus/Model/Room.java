package com.edu.multicampus.Model;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="room")
public class Room {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long roomId;
	
	private String roomName;
	
	private int roomPrice;
	
	private int roomSize;
	
	private String roomImageURl;
	
	private String roomState;
	
	
	@OneToMany(mappedBy="room")
	private List<Borrows> borrow;
	
	@OneToMany(mappedBy="room")
	private List<RoomRating> roomrating;
	
	@OneToMany(mappedBy="room")
	private List<Orders> order;
	
	@OneToMany(mappedBy="room")
	private List<Uses> use;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="code_hotel", nullable=false)
	Hotel hotel;
}
