package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;

import com.edu.multicampus.Model.Bill;

public interface BillService {
	List<Bill> getAllBills();
	
	Optional<Bill> getBillById(long id);
	
	void addBill(Bill bill);
	
	void updateBill( long id,Bill bill);
	
	void deleteBill(long id);
}
