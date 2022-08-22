package com.edu.multicampus.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.multicampus.Model.Room;
import com.edu.multicampus.Services.RoomService;

@RestController
@RequestMapping("/api")
public class RoomController {
	
	@Autowired
	RoomService roomservice;
	
	@GetMapping("/room")
	public List<Room> getAllsRoomById(){
		return roomservice.getAllRooms();
	}
	
	@GetMapping("/room/{id}")
	public Optional<Room> getRoomById(@PathVariable long id){
		return roomservice.getRoomById(id);
	}
	
	@PostMapping("/room")
	public void addRoom(@RequestBody Room room) {
		roomservice.addRoom(room);
	}
	
	@PutMapping("/room/{id}")
	public void updateRoom(@PathVariable long id, @RequestBody Room room) {
		roomservice.addRoom(room);
	}
	
	@DeleteMapping("/room/{id}")
	public void deleteRoom(@PathVariable long id) {
		roomservice.deleteRoomById(id);
	}
	@GetMapping("/room/roomname/{roomName}")
	public List<Room> getAllRoomsByName(@PathVariable String roomName){
		return roomservice.getAllRoomsByName(roomName);
	}
}
