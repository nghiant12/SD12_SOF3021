package org.example.sd12_sof3021.repos.ass1;

import org.example.sd12_sof3021.entities.MauSac;

import java.util.ArrayList;
import java.util.List;

public class MauSacRepo {
    private List<MauSac> ds;

    public MauSacRepo() {
        this.ds = new ArrayList<>();
        this.ds.add(new MauSac(1, "MS01", "Xanh", 1));
        this.ds.add(new MauSac(2, "MS02", "Vang", 1));
        this.ds.add(new MauSac(3, "MS03", "Do", 0));
    }

    public List<MauSac> findAll() {
        return this.ds;
    }

    public void create(MauSac mauSac) {
        this.ds.add(mauSac);
    }

    public void update(MauSac mauSac) {
        for (int i = 0; i < this.ds.size(); i++) {
            MauSac m = this.ds.get(i);
            if (m.getId() == mauSac.getId()) {
                this.ds.set(i, mauSac);
            }
        }
    }

    public void deleteById(int id) {
        for (int i = 0; i < this.ds.size(); i++) {
            MauSac m = this.ds.get(i);
            if (m.getId() == id) {
                this.ds.remove(i);
            }
        }
    }

    public MauSac findById(int id) {
        for (int i = 0; i < this.ds.size(); i++) {
            MauSac m = this.ds.get(i);
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }
}
