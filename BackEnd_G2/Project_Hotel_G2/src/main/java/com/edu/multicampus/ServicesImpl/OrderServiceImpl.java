package com.edu.multicampus.ServicesImpl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.multicampus.Model.Orders;
import com.edu.multicampus.Repository.OrderRepository;
import com.edu.multicampus.Services.OrdersService.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public List<Orders> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Optional<Orders> getOrderById(long id) {
		return orderRepository.findById(id) ;	
		}


	@Override
	public void deleteOrder(long id) {
		Optional<Orders> optional = orderRepository.findById(id);
		if(optional.isPresent()) {
			this.orderRepository.deleteById(id);
		}else {
			throw new RuntimeException("Order not found");
		}
	}

	@Override
	public void addOrder(Orders order) {
		this.orderRepository.save(order);
		
	}

	@Override
	public void updateOrder( long id, Orders order) {
		Optional<Orders> optional = orderRepository.findById(id);
		Orders o = null;
		if(optional.isPresent()) {
			o = optional.get();
			o.setArriveDate(order.getArriveDate());
			o.setLeaveDate(order.getLeaveDate());
			o.setStatus(order.isStatus());
			o.setCustomer(order.getCustomer());
			o.setRoom(order.getRoom());
    		orderRepository.save(o);
		}else {
			throw new RuntimeException("Order not found");
		}
	}
}

		