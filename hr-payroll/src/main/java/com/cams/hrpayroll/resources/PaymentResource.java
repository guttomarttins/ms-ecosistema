package com.cams.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cams.hrpayroll.entities.Payment;
import com.cams.hrpayroll.service.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
	
	@Autowired
	private PaymentService service;
	
	@GetMapping(value = "/{workeId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workeId, @PathVariable int days){
		Payment obj = service.getPayment(workeId, days);
		return ResponseEntity.ok(obj);
		
	}
	

}
