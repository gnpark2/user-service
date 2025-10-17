package com.example.user_service.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@RestController
public class UserController {
    @GetMapping
        public String test(){
                return "Hello!";
        }
}
