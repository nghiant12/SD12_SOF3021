package org.example.sd12_sof3021.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginCtrl {
    @GetMapping("login")
    public String getForm() {
        return "login";
    }

    @PostMapping("login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String pwd) {
        System.out.println("LoginCtrl@getForm");
        System.out.println(email);
        System.out.println(pwd);
        return "login";
    }
}
