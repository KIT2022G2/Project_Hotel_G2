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

import com.edu.multicampus.Model.Orders;
import com.edu.multicampus.Services.OrdersService;

@RestController
@RequestMapping("/api")
public class OrdersController {
	@Autowired
	OrdersService orderService;
	
	@GetMapping("/order")
	public List<Orders> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/order/{id}")
	public Optional<Orders> getOrderById(@PathVariable long id){
		return  orderService.getOrderById(id);
	}
	
	@PostMapping("/order")
	public void addOrder(@RequestBody Orders order) {
		orderService.addOrder(order);
	}
	
	@PutMapping("/order/{id}")
	public void updateorder(@PathVariable long id,@RequestBody Orders order) {
		orderService.updateOrder(id, order);
	}
	
	@DeleteMapping("/order/{id}")
	public void deleteOrder(@PathVariable long id) {
		orderService.deleteOrder(id);
	}
	

}