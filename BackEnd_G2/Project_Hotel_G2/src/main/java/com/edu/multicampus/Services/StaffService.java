package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;

import com.edu.multicampus.Model.Staff;

public interface StaffService {
	List<Staff> getAllStaffs();
	
	Optional<Staff> getStaffById(long id);
	
	void addStaff(Staff staff);
	
	void updateStaff(Staff staff,long id);
	
	void deleteStaff(long id);
	
	
}
