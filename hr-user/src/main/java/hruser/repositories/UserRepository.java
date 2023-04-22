package hruser.repositories;

import hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // consultar documentação em springjpa no google
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference

    //busca simples por email

    User findByEmail (String email);
}
