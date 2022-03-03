package com.company;

public class SwitshBeispiel {
    public static void main(String[] args) {


    }

    public static String getGradeText(int grade){
        String grateText;
        return switch(grade){
           case 1 -> grateText = "Outstanding!";
           case 2 -> grateText = "Exellent!";
           case 3 -> grateText = "Acceptable!";
           case 4 -> grateText = "Passing!";
           case 5 -> grateText = "Fail!";
           default -> grateText = null;


        };




    }
}
