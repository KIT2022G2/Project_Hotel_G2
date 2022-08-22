package com.edu.multicampus.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.multicampus.Model.Borrows;
import com.edu.multicampus.Repository.BorrowRepository;
import com.edu.multicampus.Services.BorrowsService;

@Service
public class BorrowServiceImpl implements BorrowsService {
	
	@Autowired
	private BorrowRepository borrowRepository;
	
	@Override
	public List<Borrows> getAllBorrows() {
		// TODO Auto-generated method stub
		return borrowRepository.findAll();
	}

	@Override
	public Optional<Borrows> getBorrowById(long id) {
		// TODO Auto-generated method stub
		return borrowRepository.findById(id);
	}

	@Override
	public void addBorrow(Borrows borrows) {
		this.borrowRepository.save(borrows);
	}

	@Override
	public void updateBorrow( long id, Borrows borrows) {
		// TODO Auto-generated method stub
		Optional<Borrows> optional = borrowRepository.findById(id);
		Borrows b = null;
		if(optional.isPresent()) {
			b = optional.get();
			b.setCheckinDate(borrows.getCheckinDate());
			b.setCheckoutDate(borrows.getCheckoutDate());
			b.setCustomer(borrows.getCustomer());
			b.setRoom(borrows.getRoom());
			b.setStatus(borrows.isStatus());
			borrowRepository.save(b);
		}else {
			throw new RuntimeException("Borrow not found");
		}
	}

	@Override
	public void deleteBorrow(long id) {
		// TODO Auto-generated method stub
		Optional<Borrows> optional = borrowRepository.findById(id);
		if(optional.isPresent()) {
			borrowRepository.deleteById(id);
		}else {
			throw new RuntimeException("Borrow not found");
		}
	}
	
}
