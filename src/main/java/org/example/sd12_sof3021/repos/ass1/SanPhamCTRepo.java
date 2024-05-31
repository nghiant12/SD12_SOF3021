package org.example.sd12_sof3021.repos.ass1;

import org.example.sd12_sof3021.entities.SPCT;

import java.util.ArrayList;
import java.util.List;

public class SanPhamCTRepo {
    private List<SPCT> ds;

    public SanPhamCTRepo() {
        this.ds = new ArrayList<>();
        this.ds.add(new SPCT(1, 1, 1, 1, "S", 5, 100000, 1));
        this.ds.add(new SPCT(2, 1, 1, 1, "M", 5, 100000, 1));
        this.ds.add(new SPCT(3, 1, 1, 1, "L", 5, 100000, 1));
        this.ds.add(new SPCT(4, 2, 2, 2, "S", 5, 100000, 1));
        this.ds.add(new SPCT(5, 2, 2, 2, "M", 5, 100000, 1));
        this.ds.add(new SPCT(6, 2, 2, 2, "L", 5, 100000, 1));
        this.ds.add(new SPCT(7, 3, 3, 3, "S", 5, 100000, 1));
        this.ds.add(new SPCT(8, 3, 3, 3, "M", 5, 100000, 1));
        this.ds.add(new SPCT(9, 3, 3, 3, "L", 5, 100000, 1));
    }

    public List<SPCT> findBySPId(int spId) {
        List<SPCT> kq = new ArrayList<>();
        for (SPCT spct : ds) {
            if (spct.getIdSP() == spId) {
                kq.add(spct);
            }
        }
        return kq;
    }
}
