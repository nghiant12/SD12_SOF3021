package org.example.sd12_sof3021.controllers;

import org.example.sd12_sof3021.entities.SanPham;
import org.example.sd12_sof3021.entities.SanPhamCT;
import org.example.sd12_sof3021.repos.ass1.SanPhamCTRepo;
import org.example.sd12_sof3021.repos.ass1.SanPhamRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("spct")
public class SanPhamCTCtrl {
    private SanPhamRepo sanPhamRepo = new SanPhamRepo();
    private SanPhamCTRepo spctRepo = new SanPhamCTRepo();

    @GetMapping("index")
    public String index(Model model, @RequestParam(name = "spId", defaultValue = "-1") int spId) {
        List<SanPham> ds = this.sanPhamRepo.findAll();
        model.addAttribute("data", ds);
        List<SanPhamCT> dsSPCT = spId == -1 ? new ArrayList<>() : this.spctRepo.findBySPId(spId);
        model.addAttribute("dataSPCT", dsSPCT);
        return "spct/index";
    }
}
