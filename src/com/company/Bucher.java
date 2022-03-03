package com.company;

public class Bucher {
    public static void main(String[] args) {

        int nonFiction = 2;
        int fiction = 3;
        boolean discountBooks = discountBook(fiction,nonFiction);

        System.out.println(discountBooks);
    }
    public static boolean discountBook(int fiction, int nonFiction){
        boolean discount;

        if (nonFiction > 2 && fiction >= 1) {
            discount = true;
        } else {
            discount = false;
        }

       return discount;
    }
}
