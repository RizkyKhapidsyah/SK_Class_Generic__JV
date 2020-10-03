package com.rizkykhapidsyah;

/* Created by Rizky Khapidsyah */

public class Implementasi_Class_Generic {
    public static void main(String[] args) {
        System.out.println("==============\nIMPLEMENTASI 1\n==============\n");

        Class_Generic<String> Kota = new Class_Generic<String>();
        Kota.Dorong("Jakarta");
        Kota.Dorong("Surabaya");
        Kota.Dorong("Medan");
        Kota.Dorong("Manokwari");

        /* Menampilkan Data */
        while (!Kota.apakahKosong()) {
            String item = Kota.pop();
            System.out.println(item);
        }

        System.out.println("\n\n==============\nIMPLEMENTASI 2\n==============\n");

        Class_Generic<EntrySaya<Integer, String>> Orang = new Class_Generic<>();
        Orang.Dorong(new EntrySaya<Integer, String>(3, "Rizky Khapidsyah"));
        Orang.Dorong(new EntrySaya<Integer, String>(4, "Dessy Puspita Sari"));
        Orang.Dorong(new EntrySaya<Integer, String>(5, "Falih Robbiansyah"));
        Orang.Dorong(new EntrySaya<Integer, String>(6, "Hana Rezki Adelia"));
        Orang.Dorong(new EntrySaya<Integer, String>(7, "Khairina El Tifani"));

        /* Menampilkan Data */
        while (!Orang.apakahKosong()) {
            System.out.println(Orang.pop());
        }

    }
}
