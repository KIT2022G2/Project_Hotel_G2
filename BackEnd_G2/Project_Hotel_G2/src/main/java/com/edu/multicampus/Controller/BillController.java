package com.edu.multicampus.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.edu.multicampus.Model.Bill;
import com.edu.multicampus.Services.BillService;


@RestController
@RequestMapping("/api")
public class BillController {
	
	@Autowired
	BillService billService;
	
	@GetMapping("/bill")
	public List<Bill> getAllBills(){
		return billService.getAllBills();
	}
	
	@GetMapping("/bill/{id}")
	Optional<Bill> getBillById(@PathVariable long id){
		return billService.getBillById(id);
	}
	
	@PostMapping("/bill")
	void addBill(@RequestBody Bill bill) {
		billService.addBill(bill);
	}
	
	@PutMapping("/bill/{id}")
	void updateBill(@PathVariable long id,@RequestBody Bill bill) {
		billService.updateBill(id, bill);
	}
	
	@DeleteMapping("/bill/{id}")
	void deleteBill(@PathVariable long id) {
		billService.deleteBill(id);
	}
}
