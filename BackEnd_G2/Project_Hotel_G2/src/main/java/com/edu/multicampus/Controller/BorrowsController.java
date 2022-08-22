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

import com.edu.multicampus.Model.Borrows;
import com.edu.multicampus.Services.BorrowsService;

@RestController
@RequestMapping("/api")
public class BorrowsController {
	
	@Autowired
	BorrowsService borrowservice;
	
	@GetMapping("/borrows")
	public List<Borrows> getAllBorrows(){
		return borrowservice.getAllBorrows();
	}
	
	@GetMapping("/borrows/{id}")
	public Optional<Borrows> getBorrowById(@PathVariable long id){
		return borrowservice.getBorrowById(id);
	}
	
	@PostMapping("/borrows")
	public void addBorrow(@RequestBody Borrows borrow) {
		borrowservice.addBorrow(borrow);
	}
	
	@PutMapping("/borrows/{id}")
	public void updateborrow(@PathVariable long id,@RequestBody Borrows borrow) {
		borrowservice.updateBorrow(id, borrow);
	}
	
	@DeleteMapping("/borrows/{id}")
	public void deleteBorrow(@PathVariable long id) {
		borrowservice.deleteBorrow(id);
	}
	
}