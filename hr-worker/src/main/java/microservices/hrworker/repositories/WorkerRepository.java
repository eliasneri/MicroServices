package microservices.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import microservices.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
