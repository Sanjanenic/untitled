package com.company;

public class DurchDreiModulo {
    public static void main(String[] args) {
     int a;
     int b= 3;
     String result=CheckIt(54);


    }
    public static String CheckIt (int a){
        int b =3;
        int result= a % b;
        if (result == 0){
            System.out.println ("Zahl" + a + " ist mit 3 teilbar!");
        }
        else{
            System.out.println ("Zahl" + a + " ist nicht mit 3 teilbar!");
        }
    }

}
