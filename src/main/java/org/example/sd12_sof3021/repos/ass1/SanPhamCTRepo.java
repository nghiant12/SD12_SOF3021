package org.example.sd12_sof3021.repos.ass1;

import org.example.sd12_sof3021.entities.SanPham;
import org.example.sd12_sof3021.entities.SanPhamCT;

import java.util.ArrayList;
import java.util.List;

public class SanPhamCTRepo {
    private List<SanPhamCT> ds;

    public SanPhamCTRepo() {
        this.ds = new ArrayList<>();
        this.ds.add(new SanPhamCT(1, 1, "SPCT01", "Xanh", "S", 5, 100000, 1));
        this.ds.add(new SanPhamCT(2, 1, "SPCT02", "Do", "M", 5, 100000, 1));
        this.ds.add(new SanPhamCT(3, 1, "SPCT03", "Vang", "L", 5, 100000, 1));
        this.ds.add(new SanPhamCT(4, 2, "SPCT04", "Xanh", "S", 5, 100000, 1));
        this.ds.add(new SanPhamCT(5, 2, "SPCT05", "Do", "M", 5, 100000, 1));
        this.ds.add(new SanPhamCT(6, 2, "SPCT06", "Vang", "L", 5, 100000, 1));
        this.ds.add(new SanPhamCT(7, 3, "SPCT07", "Xanh", "S", 5, 100000, 1));
        this.ds.add(new SanPhamCT(8, 3, "SPCT08", "Do", "M", 5, 100000, 1));
        this.ds.add(new SanPhamCT(9, 3, "SPCT09", "Vang", "L", 5, 100000, 1));
    }

    public List<SanPhamCT> findBySPId(int spId) {
        List<SanPhamCT> kq = new ArrayList<>();
        for (SanPhamCT spct : ds) {
            if (spct.getSpId() == spId) {
                kq.add(spct);
            }
        }
        return kq;
    }
}
