package com.github.giovanicaf.hrpayroll.services;

import com.github.giovanicaf.hrpayroll.dto.WorkerDto;
import com.github.giovanicaf.hrpayroll.entities.Payment;
import com.github.giovanicaf.hrpayroll.feignclients.WorkerFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class PaymentService {
	
	public final WorkerFeignClient workerFeignClient;

	public  Payment getPayment(long workerId, int days) {

		
		WorkerDto workerDto = workerFeignClient.findById(workerId).getBody();
		
		return new Payment(workerDto.getName(), workerDto.getDailyIncome(), days); 
	}

}
