package org.example.sd12_sof3021.controllers;

import org.example.sd12_sof3021.repos.ass2.SpctRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("spct")
public class SpctController {
    @Autowired
    private SpctRepository spctRepo;

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("data", this.spctRepo.findAllWithPropName());
        return "spct/index";
    }
}
