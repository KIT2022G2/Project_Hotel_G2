package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;



import com.edu.multicampus.Model.Orders;


public class OrdersService {
	public interface OrderService {
	    List<Orders> getAllOrders();

	    Optional<Orders> getOrderById(long id);

	    void addOrder(Orders order);

	    void updateOrder(Orders order, long id);

	    void deleteOrder(long id);

	}
}
