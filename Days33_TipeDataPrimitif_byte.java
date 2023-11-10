package com.mycompany.days33_typedataprimitifbyte;

public class Days33_TypeDataPrimitifbyte {

    public static void main(String[] args) {
        byte myByte = 38;
        System.out.println("nilai myByte: " + myByte);
        byte result = (byte) (myByte * 3);
        System.out.println("hasil perkalian: " + result);

        System.out.println("rentang nilai byte: " + Byte.MIN_VALUE + " sampai " + Byte.MAX_VALUE);
    }
}

