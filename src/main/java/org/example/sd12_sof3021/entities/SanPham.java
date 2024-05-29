package org.example.sd12_sof3021.entities;

import jakarta.persistence.*;
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

@Entity
@Table(name = "SanPham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @NotBlank(message = "Mã SP không được để trống")
    @Column(name = "Ma")
    private String ma;

    @NotBlank(message = "Tên SP không được để trống")
    @Column(name = "Ten")
    private String ten;

    @NotNull
    @Column(name = "TrangThai")
    private int trangThai;
}
