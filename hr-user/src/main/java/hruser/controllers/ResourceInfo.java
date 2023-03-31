package hruser.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public class ResourceInfo implements Serializable {

    @Value("${test.config}")
    private String test;

    @GetMapping("/info")
    public String resourceInfo() {
        return test;
    }
}
