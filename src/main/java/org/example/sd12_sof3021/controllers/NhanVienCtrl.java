package org.example.sd12_sof3021.controllers;

import jakarta.validation.Valid;
import org.example.sd12_sof3021.entities.NhanVien;
import org.example.sd12_sof3021.repos.ass2.NhanVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("nhan-vien")
public class NhanVienCtrl {

    @Autowired
    private NhanVienRepo nvRepo;

    @GetMapping("index")
    public String index(Model model) {
        List<NhanVien> ds = this.nvRepo.findAll();
        model.addAttribute("data", ds);
        return "nhan_vien/index";
    }

    @GetMapping("create")
    public String create(@ModelAttribute("data") NhanVien n) {
        return "nhan_vien/create";
    }

    @PostMapping("store")
    public String store(
            Model model,
            @Valid NhanVien n,
            BindingResult validateResult
    ) {
        if (validateResult.hasErrors()) {
            List<FieldError> listError = validateResult.getFieldErrors();
            Map<String, String> errors = new HashMap<>();
            for (FieldError fe : listError) {
                errors.put(fe.getField(), fe.getDefaultMessage());
            }
            model.addAttribute("errors", errors);
            model.addAttribute("data", n);
            return "nhan_vien/create";
        }
        this.nvRepo.save(n);
        return "redirect:/nhan-vien/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.nvRepo.deleteById(id);
        return "redirect:/nhan-vien/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") NhanVien n, Model model) {
        model.addAttribute("data", n);
        return "nhan_vien/edit";
    }

    @PostMapping("update/{id}")
    public String update(NhanVien n) {
        this.nvRepo.save(n);
        return "redirect:/nhan-vien/index";
    }
}
