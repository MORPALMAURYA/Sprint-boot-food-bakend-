package com.morpal.service;

import java.util.List;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.morpal.Exception.CartException;
import com.morpal.Exception.OrderException;
import com.morpal.Exception.RestaurantException;
import com.morpal.Exception.UserException;
import com.morpal.model.Order;
import com.morpal.model.PaymentResponse;
import com.morpal.model.User;
import com.morpal.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException, RazorpayException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
