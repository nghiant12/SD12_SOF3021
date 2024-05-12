package org.example.sd12_sof3021.repos.ass1;

import org.example.sd12_sof3021.entities.KichThuoc;

import java.util.ArrayList;
import java.util.List;

public class KichThuocRepo {
    private List<KichThuoc> ds;

    public KichThuocRepo() {
        this.ds = new ArrayList<>();
        this.ds.add(new KichThuoc(1, "KT01", "S", 1));
        this.ds.add(new KichThuoc(2, "KT02", "M", 1));
        this.ds.add(new KichThuoc(3, "KT03", "L", 0));
    }

    public List<KichThuoc> findAll() {
        return this.ds;
    }

    public void create(KichThuoc kichThuoc) {
        this.ds.add(kichThuoc);
    }

    public void update(KichThuoc kichThuoc) {
        for (int i = 0; i < this.ds.size(); i++) {
            KichThuoc k = this.ds.get(i);
            if (k.getId() == kichThuoc.getId()) {
                this.ds.set(i, kichThuoc);
            }
        }
    }

    public void deleteById(int id) {
        for (int i = 0; i < this.ds.size(); i++) {
            KichThuoc k = this.ds.get(i);
            if (k.getId() == id) {
                this.ds.remove(i);
            }
        }
    }
}
