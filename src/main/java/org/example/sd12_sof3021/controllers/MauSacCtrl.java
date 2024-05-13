package org.example.sd12_sof3021.controllers;

import org.example.sd12_sof3021.entities.MauSac;
import org.example.sd12_sof3021.entities.SanPham;
import org.example.sd12_sof3021.repos.ass1.MauSacRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("mau-sac")
public class MauSacCtrl {
    private final MauSacRepo mauSacRepo = new MauSacRepo();

    @GetMapping("index")
    public String index(Model model) {
        List<MauSac> ds = this.mauSacRepo.findAll();
        model.addAttribute("data", ds);
        return "mau_sac/index";
    }

    @GetMapping("create")
    public String create() {
        return "mau_sac/create";
    }

    @PostMapping("store")
    public String store(MauSac m) {
        this.mauSacRepo.create(m);
        return "redirect:/mau-sac/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.mauSacRepo.deleteById(id);
        return "redirect:/mau-sac/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        MauSac m = this.mauSacRepo.findById(id);
        model.addAttribute("data", m);
        return "mau_sac/edit";
    }

    @PostMapping("update/{id}")
    public String update(MauSac m) {
        this.mauSacRepo.update(m);
        return "redirect:/mau-sac/index";
    }

}
