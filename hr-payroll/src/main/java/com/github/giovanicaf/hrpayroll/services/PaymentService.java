package com.github.giovanicaf.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.giovanicaf.hrpayroll.entities.Payment;
import com.github.giovanicaf.hrpayroll.entities.dto.WorkerDto;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class PaymentService {
	
	public final RestTemplate restTemplate;
	
	@Value("${hr-worker.host}")
	private String workerHost;
	//http://localhost:8101/payments/2/days/20		
	
	public  Payment getPayment(long workerId, int days) {
		
		Map<String, String> uriVariable = new HashMap<>();
		uriVariable.put("id", String.valueOf(workerId));
		
		WorkerDto workerDto = restTemplate.getForObject(workerHost + "/workers/{id}", WorkerDto.class, uriVariable);
		
		return new Payment(workerDto.getName(), workerDto.getDailyIncome(), days); 
	}

}
