package org.example.sd12_sof3021.controllers;

import org.example.sd12_sof3021.entities.KhachHang;
import org.example.sd12_sof3021.repos.ass1.KhachHangRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("khach-hang")
public class KhachHangCtrl {
    private final KhachHangRepo khachHangRepo = new KhachHangRepo();

    @GetMapping("index")
    public String index(Model model) {
        List<KhachHang> ds = this.khachHangRepo.findAll();
        model.addAttribute("data", ds);
        return "khach_hang/index";
    }

    @GetMapping("create")
    public String create() {
        return "khach_hang/create";
    }

    @PostMapping("store")
    public String store(KhachHang khachHang) {
        this.khachHangRepo.create(khachHang);
        return "khach_hang/create";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.khachHangRepo.deleteById(id);
        return "khach_hang/create";
    }
}
