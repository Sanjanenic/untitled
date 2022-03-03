package com.company;

public class SwitshBeispiel {
    public static void main(String[] args) {
     System.out.println (getGradeText(2));

    }

    public static String getGradeText(int grade){
        String grateText;
        return switch(grade){
           case 1 -> grateText = "Outstanding!";
           case 2 -> grateText = "Excellent!";
           case 3 -> grateText = "Acceptable!";
           case 4 -> grateText = "Passing!";
           case 5 -> grateText = "Fail!";
           default -> grateText = null;

        };




    }
    public static int getGrade(String gradeText){
        return switch ((gradeText)){
            case "Outstanding!" -> 1;
            case "Exellent!!" -> 2;
            case "Acceptable!" -> 3;
            case "Passing!" -> 4;
            case "Fail!" -> 5;
            default -> 0;

        };

    }
}
