package com.mycompany.days19_iteratordiarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Days19_IteratordiArrayList {

    public static void main(String[] args) {
        ArrayList<String> namakota = new ArrayList<String>();
        namakota.add("Mambi");
        namakota.add("Mamasa");
        namakota.add("polewali");
        namakota.add("messawa");
        namakota.add("sumarorong");

        Iterator<String> iterator = namakota.iterator();
        System.out.println("Elemen-elemen namakota :");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "; ");
        }
    }
}
