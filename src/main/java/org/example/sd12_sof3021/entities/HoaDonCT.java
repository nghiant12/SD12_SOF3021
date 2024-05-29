package org.example.sd12_sof3021.entities;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class HoaDonCT {
    private Integer id;
    private Integer hdId;
    private Integer spctId;
    @NotNull(message = "Số lượng không được để trống")
    private Integer soLuong;
    @NotNull(message = "Đơn giá không được để trống")
    private Float donGia;
    private int trangThai;
}
