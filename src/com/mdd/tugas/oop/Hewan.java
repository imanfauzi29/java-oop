package com.mdd.tugas.oop;

import java.util.List;

public class Hewan {

    String nama, jenis;
    int umur;

    public Hewan () {
        profilHewan();
    }

    public Hewan(String nama, int umur, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String profilHewan() {
        return "Hewan{" +
                "nama='" + nama + '\'' +
                ", jenis='" + jenis + '\'' +
                ", umur=" + umur +
                '}';
    }

    void statusHewan(List<Hewan> hewan) {
        if(hewan instanceof List) {
            hewan.stream().map(h -> {
                String result = "";
                if(h.umur < 1) result = h.nama + " Belum siap diternakan";
                else if (h.umur >= 1 && h.umur <= 4) result = h.nama + " Siap diternakan";
                else if(h.umur > 5) result = h.nama+" Hewan sudah tua";

                return result;
            }).forEach(System.out::println);
        }
    }

}
