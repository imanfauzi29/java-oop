package com.mdd.tugas.oop;

public class Ikan extends Hewan {

    public Ikan () {
        super("nila", 3, "veterbrata");
    }

    public int hitungBerat(int bobot) {
        int berat;
        berat = umur * bobot;
        return berat;
    }

    public int hitungBerat(int bobot, int kandunganAir) {
        int berat;
        berat = (umur * bobot) - kandunganAir;
        return berat;
    }
}
