package hroauth.services;

import hroauth.entities.User;
import hroauth.feignclients.UserFeignCliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UserService implements Serializable {

    private static Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserFeignCliente userFeignCliente;

    public User findByEmail(String email) {
        User user =  userFeignCliente.findByEmail(email).getBody(); // vai pegar a resposta que está dentro do Response Entity
        if (user == null){
            log.error("Email Not Found: " + email);
            throw new IllegalArgumentException("Email not Found");
        }
        log.info("Email Found! : " + email);
        return user;
    }
}
