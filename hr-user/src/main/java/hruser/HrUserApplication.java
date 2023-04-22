package hruser;

import hruser.utils.VerifyStatusMyApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class HrUserApplication  implements CommandLineRunner {

		@Autowired
		private BCryptPasswordEncoder passwordEncoder;

		public static void main(String[] args) {

		SpringApplication.run(HrUserApplication.class, args);


	}


	@GetMapping(value = "/")
	public String returnZero() {
		String str = VerifyStatusMyApi.verifyStatusMyApi(true);
		return str;
		}


	@Override
	public void run(String... args) throws Exception {
		// System.out.println("BCRYPT: " + passwordEncoder.encode("123456"));

	}
}
