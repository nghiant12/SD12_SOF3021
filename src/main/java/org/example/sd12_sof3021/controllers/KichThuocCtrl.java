package org.example.sd12_sof3021.controllers;

import org.example.sd12_sof3021.entities.KichThuoc;
import org.example.sd12_sof3021.repos.ass1.KichThuocRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("kich-thuoc")
public class KichThuocCtrl {
    private final KichThuocRepo kichThuocRepo = new KichThuocRepo();

    @GetMapping("index")
    public String index(Model model) {
        List<KichThuoc> ds = this.kichThuocRepo.findAll();
        model.addAttribute("data", ds);
        return "kich_thuoc/index";
    }

    @GetMapping("create")
    public String create() {
        return "kich_thuoc/create";
    }

    @PostMapping("store")
    public String store(KichThuoc kichThuoc) {
        this.kichThuocRepo.create(kichThuoc);
        return "redirect:/kich-thuoc/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.kichThuocRepo.deleteById(id);
        return "redirect:/kich-thuoc/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        KichThuoc kt = this.kichThuocRepo.findById(id);
        model.addAttribute("data", kt);
        return "kich_thuoc/edit";
    }

    @PostMapping("update/{id}")
    public String update(KichThuoc kt) {
        this.kichThuocRepo.update(kt);
        return "redirect:/kich-thuoc/index";
    }
}
