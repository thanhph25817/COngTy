package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin
@Slf4j
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/login")
    public ResponseEntity<LoginRequest> login(@RequestBody String loginRequest) {
        log.info("login request {}", loginRequest);
        return new ResponseEntity<>(new LoginRequest(UUID.randomUUID().toString()), HttpStatus.OK);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class LoginRequest {
        private String data;
    }
}
