package com.edu.multicampus.Model;
import java.util.List;

import javax.persistence.*;
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
	
	@Column(name="coderoom", nullable=false, unique=true)
	private String codeRoom;
	
	@OneToMany(mappedBy="borrow")
	private List<Borrow> borrow;
	
	@OneToMany(mappedBy="roomrating")
	private List<RoomRating> roomrating;
	
	@OneToMany(mappedBy="order")
	private List<Order> order;
	
	@OneToMany(mappedBy="use")
	private List<Use> use;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hotelId", nullable=false)
	Hotel hotel;
}
