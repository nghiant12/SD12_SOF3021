package org.example.sd12_sof3021.controllers;

import jakarta.validation.Valid;
import org.example.sd12_sof3021.entities.SanPham;
import org.example.sd12_sof3021.repos.ass2.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
public class SanPhamController {
    @Autowired
    private SanPhamRepository spRepo;

    @GetMapping("index")
    public String index(@RequestParam(name = "page", defaultValue = "1") int pageNo, @RequestParam(name = "limit", defaultValue = "10") int pageSize, @RequestParam(name = "keyword", defaultValue = "") String keyword, Model model) {
        PageRequest p = PageRequest.of(pageNo, pageSize);
        String s = "%" + keyword + "%";
        Page<SanPham> ds = this.spRepo.findByTenLike(s, p);
        model.addAttribute("data", ds);
        return "san_pham/index";
    }

    @GetMapping("create")
    public String create(@ModelAttribute("data") SanPham sp) {
        return "san_pham/create";
    }

    @PostMapping("store")
    public String store(Model model, @Valid SanPham sp, BindingResult validateResult) {
        if (validateResult.hasErrors()) {
            List<FieldError> listError = validateResult.getFieldErrors();
            Map<String, String> errors = new HashMap<>();

            for (FieldError fe : listError) {
                errors.put(fe.getField(), fe.getDefaultMessage());
            }

            model.addAttribute("errors", errors);
            model.addAttribute("data", sp);
            return "san_pham/create";
        }

        this.spRepo.save(sp);
        return "redirect:/san-pham/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.spRepo.deleteById(id);
        return "redirect:/san-pham/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") SanPham sp, Model model) {
        model.addAttribute("data", sp);
        return "san_pham/edit";
    }

    @PostMapping("update/{id}")
    public String update(SanPham sp) {
        this.spRepo.save(sp);
        return "redirect:/san-pham/index";
    }
}
