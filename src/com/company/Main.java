package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isDog = false;
        boolean isSenior= true;
        boolean isStudent= true;
        double ticketPrice= 2.5;
        double discount=getBus(ticketPrice,isDog,isSenior, isStudent );

        System.out.println("I seved: " + discount + " Euro für my " + ticketPrice + " ticket");


    }

    public static double getBus (double ticketPrice, boolean isDog,boolean isSenior, boolean isStudent ){
        double discount;

        if(isDog){
            discount= ticketPrice * 0.2;
        }
        else if (isSenior){
            discount=ticketPrice * 0.15;
        }
        else if (isStudent){
            discount=ticketPrice * 0.1;
        }
        else{
            discount=0;
        }

        return  discount;

    }
}

