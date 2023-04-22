package hruser.resources;

import hruser.entities.User;
import hruser.repositories.UserRepository;
import hruser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/users")
public class UserResource implements Serializable {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email){
        return ResponseEntity.ok(userService.findByEmail(email));
    }

}
