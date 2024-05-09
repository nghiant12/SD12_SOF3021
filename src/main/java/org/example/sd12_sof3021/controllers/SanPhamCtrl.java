package org.example.sd12_sof3021.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SanPhamCtrl {
    @GetMapping("san-pham/create")
    public String create() {
        return "san_pham/create";
    }

    @PostMapping("san-pham/store")
    public String store(
            @RequestParam("ma") String maSP,
            @RequestParam("ten") String tenSP,
            @RequestParam("trangThai") Integer trangThaiSP
    ) {
        System.out.println("SanPhamCtrl@store");
        System.out.println(maSP);
        System.out.println(tenSP);
        System.out.println(trangThaiSP);
        System.out.println("--------------------------");
        return "san_pham/create";
    }

    @GetMapping("san-pham/index")
    public String index() {
        return "san_pham/index";
    }

}
