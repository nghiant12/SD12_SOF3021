package org.example.sd12_sof3021.repos.ass2;

import org.example.sd12_sof3021.entities.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepository
        extends JpaRepository<SanPham, Integer> {
//    @Query("SELECT sp FROM SanPham sp WHERE sp.ten LIKE :keyword")
//    public Page<SanPham> findByTenLike(@Param("keyword") String keyword, PageRequest p);

    public Page<SanPham> findByTenLike(String keyword, PageRequest p);
}
