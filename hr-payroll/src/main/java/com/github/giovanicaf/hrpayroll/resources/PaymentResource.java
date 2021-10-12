package com.github.giovanicaf.hrpayroll.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.giovanicaf.hrpayroll.entities.Payment;
import com.github.giovanicaf.hrpayroll.services.PaymentService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/payments")
public class PaymentResource {
	
	public final PaymentService service;
	
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){
				
		Payment payment = service.getPayment(workerId, days);		
		return ResponseEntity.ok(payment);
		
	}

}
