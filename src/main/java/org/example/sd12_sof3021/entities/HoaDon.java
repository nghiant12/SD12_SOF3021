package org.example.sd12_sof3021.entities;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class HoaDon {
    private Integer id;
    private Integer nvId;
    private Integer khId;
    @NotNull(message = "Ngày mua hàng không được để trống")
    private Date ngayMuaHang;
    private int trangThai;
}
