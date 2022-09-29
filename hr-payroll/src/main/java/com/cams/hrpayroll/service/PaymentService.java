package com.cams.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cams.hrpayroll.entities.Payment;
import com.cams.hrpayroll.entities.Worker;
import com.cams.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(long workerId, int days) { 
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
