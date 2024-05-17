package org.example.sd12_sof3021.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class SanPham {
    private Integer id;

    @NotBlank(message = "Mã SP không được để trống")
    private String ma;

    @NotBlank(message = "Tên SP không được để trống")
    private String ten;

    @NotNull
    private int trangThai;
}
