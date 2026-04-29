package com.morpal.service;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.morpal.model.Order;
import com.morpal.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;
	PaymentResponse createRazorpayPaymentLink(Order order) throws RazorpayException;
}