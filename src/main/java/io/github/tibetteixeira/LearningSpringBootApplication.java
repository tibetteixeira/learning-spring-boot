package io.github.tibetteixeira;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearningSpringBootApplication {

    @Value("${application.name}")
    private String applicationName;

    @Value("${spring.profiles.active}")
    private String profile;

    @GetMapping("/hello")
    public String hello() {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringBootApplication.class, args);
    }
}
