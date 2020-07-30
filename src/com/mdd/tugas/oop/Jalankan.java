package com.mdd.tugas.oop;

import java.util.ArrayList;

public class Jalankan {

    public static void main(String[] args) {
       dataHewan();
    }

    private static void dataHewan() {
        Hewan animal = new Hewan();
        var newData = new ArrayList<Hewan>();

        newData.add(unggas());
        newData.add(reptile());


        ArrayList data = new ArrayList<Hewan>();
        data.addAll(0,newData);

        System.out.println("\nREPTILE");
        System.out.println(unggas().profilHewan());
        System.out.println(reptile().profilHewan());

        System.out.println("\nREPTILE DAN UNGGAS");
        animal.statusHewan(newData);

        System.out.println("\nMURAI");
        murai();

        System.out.println("\nTENGIRI");
        tengiri();
    }

    private static Hewan unggas () {
        return new Hewan("merpati", 1, "vertebrata");
    }

    private  static Hewan reptile () {
        Hewan hewan = new Hewan();

        hewan.setNama("buaya");
        hewan.setUmur(2);
        hewan.setJenis("vertebrata");

        return hewan;
    }

    private static Unggas murai() {
        Unggas unggas = new Unggas();
        unggas.nama = "murai batu";
        unggas.umur = 6;
        unggas.jenis = "vertebrata";

        var hewan = new ArrayList<Hewan>();
        hewan.add(unggas);

        unggas.statusHewan(hewan);

        System.out.println(unggas.profilHewan());
        return unggas;
    }

    private static Ikan tengiri() {
        Ikan ikan = new Ikan();
        ikan.nama = "tengiri laut";
        ikan.umur = 3;
        ikan.jenis = "veterbrata";

        var hewan = new ArrayList<Hewan>();
        hewan.add(ikan);

        System.out.println(ikan.profilHewan());
        ikan.statusHewan(hewan);
        System.out.println(ikan.hitungBerat(10));
        System.out.println(ikan.hitungBerat(10, 5));

        return ikan;
    }
}
