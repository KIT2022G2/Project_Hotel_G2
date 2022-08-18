package com.edu.multicampus.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.multicampus.Model.Staff;
import com.edu.multicampus.Repository.StaffRepository;
import com.edu.multicampus.Services.StaffService;

@Service
public class StaffServiceImpl implements StaffService{
	
	@Autowired
	private StaffRepository staffRepository;
	
	@Override
	public List<Staff> getAllStaffs() {
		
		return staffRepository.findAll();
	}

	@Override
	public Optional<Staff> getStaffById(long id) {
		
		return staffRepository.findById(id);
	}

	@Override
	public void addStaff(Staff staff) {
		
		this.staffRepository.save(staff);
	}

	@Override
	public void updateStaff(long id, Staff staff) {
		Optional<Staff> optional = staffRepository.findById(id);
		Staff s = null;
		if(optional.isPresent()) {
			s = optional.get();
			s.setStaffUserName(staff.getStaffUserName());
			s.setStaffPassword(staff.getStaffPassword());
			s.setStaffName(staff.getStaffName());
			s.setHotel(staff.getHotel());
			s.setBill(staff.getBill());
			staffRepository.save(s);
		}else {
			throw new RuntimeException("Staff not found");
		}
		
	}

	@Override
	public void deleteStaff(long id) {
		Optional<Staff> optional = staffRepository.findById(id);
		if(optional.isPresent()) {
			this.staffRepository.deleteById(id);
		}else {
			throw new RuntimeException("Staff not found");
		}
	}
	
}
