package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;

import com.edu.multicampus.Model.Borrows;

public interface BorrowsService {
	List<Borrows> getAllBorrows();
	
	Optional<Borrows> getBorrowsById(long id);
	
	void addBorrows(Borrows borrows);
	
	void updateBorrows(Borrows borrows, long id);
	
	void deleteBorrows(long id);
}



