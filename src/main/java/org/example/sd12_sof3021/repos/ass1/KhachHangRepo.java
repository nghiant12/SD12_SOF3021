package org.example.sd12_sof3021.repos.ass1;

import org.example.sd12_sof3021.entities.KhachHang;
import org.example.sd12_sof3021.entities.SanPham;

import java.util.ArrayList;
import java.util.List;

public class KhachHangRepo {
    private List<KhachHang> ds;

    public KhachHangRepo() {
        this.ds = new ArrayList<>();
        this.ds.add(new KhachHang(1, "KH01", "Nguyen Thu Nghia", "0834045324", 1));
        this.ds.add(new KhachHang(2, "KH02", "Nguyen Thu Nghia", "0834045324", 1));
        this.ds.add(new KhachHang(3, "KH03", "Nguyen Thu Nghia", "0834045324", 0));
    }

    public List<KhachHang> findAll() {
        return this.ds;
    }

    public void create(KhachHang kh) {
        this.ds.add(kh);
    }

    public void update(KhachHang kh) {
        for (int i = 0; i < this.ds.size(); i++) {
            KhachHang k = this.ds.get(i);
            if (k.getId() == kh.getId()) {
                this.ds.set(i, kh);
            }
        }
    }

    public void deleteById(int id) {
        for (int i = 0; i < this.ds.size(); i++) {
            KhachHang k = this.ds.get(i);
            if (k.getId() == id) {
                this.ds.remove(i);
            }
        }
    }

    public KhachHang findById(int id) {
        for (int i = 0; i < this.ds.size(); i++) {
            KhachHang kh = this.ds.get(i);
            if (kh.getId() == id) {
                return kh;
            }
        }
        return null;
    }
}
