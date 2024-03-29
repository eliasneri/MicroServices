package microservices.hrworker.resources;

import microservices.hrworker.entities.Worker;
import microservices.hrworker.repositories.WorkerRepository;
import microservices.hrworker.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RefreshScope
@RestController
@RequestMapping(value = "/workers")
@CrossOrigin(origins = "*")
public class WorkerResource implements Serializable{
	private static final long serialVersionUID = 1L;

	private static Logger log = LoggerFactory.getLogger(WorkerResource.class);

	@Value("${test.config}")
	private String testConfig;

	@Value("${database.name}")
	private String dataBase;

	@Value("${database.login}")
	private String login;

	@Autowired
	private Environment env;

	@Autowired
	private WorkerRepository repository;

	@Autowired
	private Utils utils;
	
	@GetMapping
	@Transactional(readOnly = true)
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
		
	}

	@GetMapping(value = "/{id}")
	@Transactional(readOnly = true)
	public ResponseEntity<Worker> findById(@PathVariable Long id){

		/* Para simular o TimeOut
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		 */

		Worker obj = repository.findById(id).get();
		log.info("Load Balance PORT = " + env.getProperty("local.server.port"));
		return ResponseEntity.ok(obj);
		
	}
	@GetMapping(value = "/configs")
	public ResponseEntity<Map<String, String>> getConfigs() {

		log.info("CONFIG -> " + testConfig);
			Map<String, String> map = new LinkedHashMap<>();
			map.put("Sucess", "ok");
			map.put("On GitHub: ", testConfig);
			map.put("Database: ", dataBase);
			map.put("Texto: ", "Elias Neri");
			map.put("Oculto: ", utils.encriptString(testConfig).getStringEncoding());

		return ResponseEntity.ok(map);


	}
	
	

}
