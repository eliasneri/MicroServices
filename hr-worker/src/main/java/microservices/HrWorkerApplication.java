package microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrWorkerApplication {

	public static void main(String[] args) {
		System.out.println("Created by Elias Neri - 11/2022");
		SpringApplication.run(HrWorkerApplication.class, args);
	}

}
