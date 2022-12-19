package microservices.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import microservices.hrpayroll.entities.Payment;
import microservices.hrpayroll.entities.Worker;
import microservices.hrpayroll.entities.Error;
import microservices.hrpayroll.feignClients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
			
	public Payment getPayment(long workerId, int days) {
		// Map<String, String> uriVariables = new HashMap<>();
		// uriVariables.put("id", ""+workerId);
		// Com o FeignClient não precisa utilizar essa MAP
		
			
		
			Worker worker = workerFeignClient.findById(workerId).getBody();
			return new Payment(worker.getname(), worker.getDailyIncome(), days);
			
		
		
		
	}
	
}
