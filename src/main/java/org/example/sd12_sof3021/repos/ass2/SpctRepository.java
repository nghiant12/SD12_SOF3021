package org.example.sd12_sof3021.repos.ass2;

import org.example.sd12_sof3021.entities.SPCT;
import org.example.sd12_sof3021.entities.SpctCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpctRepository
        extends JpaRepository<SPCT, Integer> {

    @Query("SELECT new SpctCustom(spct.id, spct.idMS, spct.idKT, sp.ten, spct.maSPCT, " +
            " spct.soLuong, spct.donGia, spct.trangThai) FROM SPCT spct JOIN SanPham sp ON spct.idSP = sp.id")
    public List<SpctCustom> findAllWithPropName();
}
