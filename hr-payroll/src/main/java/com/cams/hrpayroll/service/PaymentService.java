package com.cams.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.cams.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bobo", 200.0, days);
	}
}
