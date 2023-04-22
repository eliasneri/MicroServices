package hruser.services;

import hruser.entities.User;
import hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UserService implements Serializable {

    @Autowired
    private UserRepository userRepository;

    public User findById(Long id){
        User user = userRepository.findById(id).get();
        return user;
    }
    public User findByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return user;
    }
}
