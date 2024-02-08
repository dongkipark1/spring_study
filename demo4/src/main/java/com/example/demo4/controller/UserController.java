package com.example.demo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/joinForm4")
    public String joinForm4(){
        return "joinForm4";
    }

    @PostMapping("/join4")
    public String join4(String username, String password, String email){
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("email: " + email);

        if (username.length() > 10){
            return "error-404";
        }
        return "";
    }
}
