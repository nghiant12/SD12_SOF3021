package org.example.sd12_sof3021.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class SanPhamCT {
    private Integer id;
    private Integer spId;
    private String ma;
    private String mau;
    private String kichThuoc;
    private int soLuong;
    private float donGia;
    private int trangThai;
}
