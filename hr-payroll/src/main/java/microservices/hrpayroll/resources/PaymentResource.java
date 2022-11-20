package microservices.hrpayroll.resources;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.hrpayroll.entities.Payment;
import microservices.hrpayroll.service.PaymentService;

@RestController
@RequestMapping(value = "/payments" )
public class PaymentResource implements Serializable {
	private static final long serialVersionUID = 1L;
	
		
	@Autowired
	private PaymentService service;
	
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){
		
			Payment payment = service.getPayment(workerId, days);
			return ResponseEntity.ok(payment);
		
	}
	
	

}
