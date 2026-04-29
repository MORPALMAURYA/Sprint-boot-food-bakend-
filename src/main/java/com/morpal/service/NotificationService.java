package com.morpal.service;

import java.util.List;

import com.morpal.model.Notification;
import com.morpal.model.Order;
import com.morpal.model.Restaurant;
import com.morpal.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
