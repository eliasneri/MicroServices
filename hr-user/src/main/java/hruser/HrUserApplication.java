package hruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class HrUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}

	@GetMapping(value = "/")
	public String returnZero() {

		String str = "Hr-User Port: ";
		return str;
		}


}
