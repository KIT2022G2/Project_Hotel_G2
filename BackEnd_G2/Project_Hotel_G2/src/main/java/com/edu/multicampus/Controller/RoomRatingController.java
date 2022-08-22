package com.edu.multicampus.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.multicampus.Model.RoomRating;
import com.edu.multicampus.Services.RoomRatingService;

@RestController
@RequestMapping("/api")
public class RoomRatingController {
	
	@Autowired
	RoomRatingService roomRatingService;
	
	@GetMapping("/roomrating")
	public List<RoomRating> getAllRoomRating(){
		return roomRatingService.getAllRoomRating();
	}
	
	@PostMapping("/roomrating")
	void addRoomRating(@RequestBody RoomRating roomRating) {
		roomRatingService.addRoomRating(roomRating);
	}
}
