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

import com.edu.multicampus.Model.Staff;
import com.edu.multicampus.Services.StaffService;


@RestController
@RequestMapping("/api")
public class StaffController {
	
	@Autowired
	StaffService staffService;
	
	@GetMapping("/staff")
	public List<Staff> getAllStaffs(){
		return staffService.getAllStaffs();
	}
	
	@GetMapping("/staff/{id}")
	Optional<Staff> getStaffById(@PathVariable long id){
		return staffService.getStaffById(id);
	}
	
	@PostMapping("/staff")
	void addStaff(@RequestBody Staff staff) {
		staffService.addStaff(staff);
	}
	
	@PutMapping("/staff/{id}")
	void updateStaff(@PathVariable long id, @RequestBody Staff staff) {
		staffService.updateStaff(id, staff);
	}
	
	@DeleteMapping("/staff/{id}")
	void deleteStaff(@PathVariable long id) {
		staffService.deleteStaff(id);
	}
}
