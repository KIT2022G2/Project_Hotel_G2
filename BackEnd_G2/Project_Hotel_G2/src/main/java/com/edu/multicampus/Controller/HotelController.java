package com.edu.multicampus.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.multicampus.Model.Hotel;
import com.edu.multicampus.Services.HotelService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class HotelController {
	@Autowired
	HotelService hotelservice;
	
	@GetMapping("/hotel")
	public List<Hotel> getAllHotels(){
		return hotelservice.getAllHotels();
	}
	
	@GetMapping("/hotel/{id}")
	public Optional<Hotel> getHotelById(@PathVariable long id){
		return hotelservice.getHotelById(id);
	}
	
	@PostMapping("/hotel")
	public void addHotel(@RequestBody Hotel hotel) {
		hotelservice.addHotel(hotel);
	}
	
	@PutMapping("/hotel/{id}")
	public void updateHotel(@PathVariable long id,@RequestBody Hotel hotel) {
		hotelservice.updateHotelById(id, hotel);
	}
	
	@DeleteMapping("/hotel/{id}")
	public void deleteHotel(@PathVariable long id) {
		hotelservice.deleteHotelById(id);
	}
	
	@GetMapping("/hotel/hotelname/{hotelname}")
	public List<Hotel> getAllHotelsByName(@PathVariable String hotelname){
		return hotelservice.getAllHotelsByName(hotelname);
	}
}
