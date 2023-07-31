package microservices.hrconfigserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigServer
public class HrConfigServerApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(HrConfigServerApplication.class);

	@Value("${spring.cloud.config.server.git.username}")
	private String userName;

	public static void main(String[] args) {

		try {
			SpringApplication.run(HrConfigServerApplication.class, args);
			log.info("HR-Config-Server STARTED SUCCESS!!!");
		} catch (RuntimeException e) {
			log.info("ERRO!!!");
			e.printStackTrace();
		}

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("USERNAME = " + userName);
		// para resolver autenticação com token no git
		// https://mycyberuniverse.com/how-fix-fatal-authentication-failed-for-https-github-com.html

	}
}
