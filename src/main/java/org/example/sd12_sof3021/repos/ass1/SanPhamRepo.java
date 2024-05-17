package org.example.sd12_sof3021.repos.ass1;

import org.example.sd12_sof3021.entities.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamRepo {
    private List<SanPham> ds;

    public SanPhamRepo() {
        this.ds = new ArrayList<>();
        this.ds.add(new SanPham(1, "SP01", "Ao phong", 1));
        this.ds.add(new SanPham(2, "SP02", "Ao vit", 1));
        this.ds.add(new SanPham(3, "SP03", "Ao ga con", 0));
    }

    public List<SanPham> findAll() {
        return this.ds;
    }

    public void create(SanPham s) {
        this.ds.add(s);
    }

    public void update(SanPham sp) {
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham s = this.ds.get(i);
            if (s.getId() == sp.getId()) {
                this.ds.set(i, sp);
            }
        }
    }

    public void deleteById(int id) {
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham s = this.ds.get(i);
            if (s.getId() == id) {
                this.ds.remove(i);
            }
        }
    }

    public SanPham findById(int id) {
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham s = this.ds.get(i);
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

}
