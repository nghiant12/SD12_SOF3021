package org.example.sd12_sof3021.controllers;

import jakarta.validation.Valid;
import org.example.sd12_sof3021.entities.SanPham;
import org.example.sd12_sof3021.repos.ass1.SanPhamRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("san-pham")
public class SanPhamCtrl {
    private final SanPhamRepo spRepo = new SanPhamRepo();

    @GetMapping("index")
    public String index(Model model) {
        List<SanPham> ds = this.spRepo.findAll();
        model.addAttribute("data", ds);
        return "san_pham/index";
    }

    @GetMapping("create")
    public String create(@ModelAttribute("data") SanPham sanPham) {
        return "san_pham/create";
    }

    @PostMapping("store")
    public String store(
            Model model,
            @Valid SanPham sanPham,
            BindingResult validateResult
    ) {
        if (validateResult.hasErrors()) {
            List<FieldError> listError = validateResult.getFieldErrors();
            Map<String, String> errors = new HashMap<>();
            for (FieldError fe : listError) {
                errors.put(fe.getField(), fe.getDefaultMessage());
            }
            model.addAttribute("errors", errors);
            model.addAttribute("data", sanPham);
            return "san_pham/create";
        }
        this.spRepo.create(sanPham);
        return "redirect:/san-pham/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.spRepo.deleteById(id);
        return "redirect:/san-pham/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        SanPham sp = this.spRepo.findById(id);
        model.addAttribute("data", sp);
        return "san_pham/edit";
    }

    @PostMapping("update/{id}")
    public String update(SanPham sp) {
        this.spRepo.update(sp);
        return "redirect:/san-pham/index";
    }
}
