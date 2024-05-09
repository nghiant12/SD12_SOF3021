package org.example.sd12_sof3021.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloCtrl {
    @RequestMapping("hello")
    public String sayHello() {
        return "hello";
    }
}
