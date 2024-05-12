package org.example.sd12_sof3021.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class KhachHang {
    private Integer id;
    private String maKH;
    private String ten;
    private String sdt;
    private int trangThai;
}
