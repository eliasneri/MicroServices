package hroauth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
@EnableFeignClients
public class HrOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrOauthApplication.class, args);
	}

	@GetMapping(value ="/")
	public static ResponseEntity<String> endPointZero(){
		return ResponseEntity.ok("Api OAuth!!!");

	}

}
