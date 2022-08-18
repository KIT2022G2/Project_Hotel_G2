package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;

import com.edu.multicampus.Model.Borrows;

public interface BorrowsService {
	List<Borrows> getAllBorrows();
	
	Optional<Borrows> getBorrowById(long id);
	
	void addBorrow(Borrows borrows);
	
	void updateBorrow(long id, Borrows borrows);
	
	void deleteBorrow(long id);
}



