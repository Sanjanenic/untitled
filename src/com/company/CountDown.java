package com.company;

public class CountDown {
    public static void main(String[] args) {

        int first;
        //int last;Ovo mi ne treba
        CountDownVon(19);


    }

    public static void CountDownVon(int first){

         //int last =0;
         while (first!=0){
             System.out.println (first);
             first --;

         }
    }
}
