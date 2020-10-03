package com.rizkykhapidsyah;

/* Created by Rizky Khapidsyah */

public class EntrySaya<K, N> {
    private final K Kunci;
    private final N Nilai;

    public EntrySaya(K kunci, N nilai) {
        Kunci = kunci;
        Nilai = nilai;
    }

    public K dapatkanKunci() {
        return Kunci;
    }

    public N dapatkanNilai() {
        return Nilai;
    }

    @Override
    public String toString() {
        return "(" + Kunci + "," + Nilai + ")";
    }
}
