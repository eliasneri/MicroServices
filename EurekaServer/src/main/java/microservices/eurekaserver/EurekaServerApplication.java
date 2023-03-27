package microservices.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	private static boolean statusEureka = false;
	private static Logger log = LoggerFactory.getLogger(EurekaServerApplication.class);
	
	public static void main(String[] args) {
						
		try {
		
			SpringApplication.run(EurekaServerApplication.class, args);
			log.info("EurekaServer / Registry: STARTED!!" );
			statusEureka = true;

		} catch (Exception e) {
			log.error("EurekaServer/Registry NOT initialize");
			e.printStackTrace();
		
		}
	}

	public static boolean isStatusEureka() {
		return EurekaServerApplication.isStatusEureka();
	}

}
