package com.mycompany.days18_strukturdatalinkedlistt;

import java.util.LinkedList;

public class Days18_StrukturDataLinkedListt {

    public static void main(String[] args) {
        LinkedList<String> listkata = new LinkedList<String>();

        listkata.add("hp");
        listkata.add("leptop");
        listkata.addLast("pc");
        listkata.addFirst("plastation");
        listkata.add(2, "kabel");
        listkata.add(2, "kipas");

        System.out.println("listkata: " + listkata);

        listkata.remove("pc");
        System.out.println("'pc': " + listkata);

        listkata.remove("hp");
        System.out.println("hp: " + listkata);

        listkata.removeFirst();
        System.out.println(": " + listkata);

        listkata.removeLast();
        System.out.println(": " + listkata);
    }
}
