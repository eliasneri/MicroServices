package microservices.hrconfigserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigServer
public class HrConfigServerApplication {

	private static Logger log = LoggerFactory.getLogger(HrConfigServerApplication.class);

	public static void main(String[] args) {

		try {
			SpringApplication.run(HrConfigServerApplication.class, args);
			log.info("HR-Config-Server STARTED SUCESS!!!");
		} catch (RuntimeException e) {
			log.info("ERRO!!!");
			e.printStackTrace();
		}

	}

}
