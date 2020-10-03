package com.rizkykhapidsyah;

import java.util.ArrayList;

/* Created by Rizky Khapidsyah */

public class Class_Generic<E> {
    private ArrayList<E> AL = new ArrayList<>();

    public int dapatkanUkuran() {
        return AL.size();
    }

    public void Dorong(E item) {
        AL.add(item);
    }

    public E pop() {
        E item = AL.get(dapatkanUkuran() - 1);
        AL.remove(dapatkanUkuran() - 1);
        return item;
    }

    public boolean apakahKosong(){
        return AL.isEmpty();
    }
}
