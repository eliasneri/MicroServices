package microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import microservices.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
