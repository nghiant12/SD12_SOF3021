package org.example.sd12_sof3021.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Ma")
    @NotBlank(message = "Mã NV không được để trống")
    private String ma;

    @Column(name = "Ten")
    @NotBlank(message = "Tên NV không được để trống")
    private String ten;

    @Column(name = "TenDangNhap")
    @NotBlank(message = "Tên đăng nhập không được để trống")
    private String tenDangNhap;

    @Column(name = "MatKhau")
    @NotBlank(message = "Mật khẩu không được để trống")
    private String matKhau;

    @Column(name = "TrangThai")
    private int trangThai;
}
