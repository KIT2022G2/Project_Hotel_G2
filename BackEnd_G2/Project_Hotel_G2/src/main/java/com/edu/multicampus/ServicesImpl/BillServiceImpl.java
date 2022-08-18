package com.edu.multicampus.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.multicampus.Model.Bill;
import com.edu.multicampus.Repository.BillRepository;
import com.edu.multicampus.Services.BillService;

@Service
public class BillServiceImpl implements BillService{
	
	@Autowired
	private BillRepository billRepository;
	
	@Override
	public List<Bill> getAllBills() {
		return billRepository.findAll();
	}

	@Override
	public Optional<Bill> getBillById(long id) {
		// TODO Auto-generated method stub
		return billRepository.findById(id);
	}

	@Override
	public void addBill(Bill bill) {
		this.billRepository.save(bill);
		
	}

	@Override
	public void updateBill( long id,Bill bill) {
		Optional<Bill> optional = billRepository.findById(id);
		Bill b = null;
		if(optional.isPresent()) {
			b = optional.get();
			b.setCheckinDate(bill.getCheckinDate());
			b.setCheckoutDate(bill.getCheckoutDate());
			b.setStatus(bill.isStatus());
			b.setStaff(bill.getStaff());
			b.setCustomer(bill.getCustomer());
			billRepository.save(b);
		}else {
			throw new RuntimeException("Bill not found");
		}
	}

	@Override
	public void deleteBill(long id) {
		Optional<Bill> optional = billRepository.findById(id);
		if(optional.isPresent()) {
			this.billRepository.deleteById(id);
		}else {
			throw new RuntimeException("Bill not found");
		}
	}
	
}
