package com.company;

public class GradingTable {
    public static void main(String[] args) {

        int points;
        String grade;
      String  result =getGrade (59);


    }

    public static String getGrade (int points){
        String grade;
        if (points>=90) {

           grade ="Quatstanding!";
           System.out.println (grade);

       }
       else if (points >= 78 && points <=89){
           grade ="Exellent!!";
           System.out.println (grade);
       }
       else if (points >= 65 && points <=77){
           grade ="Acceptable!";
           System.out.println (grade);
       }
       else if (points >= 51 && points <=64){
           grade ="Passing!";
           System.out.println (grade);

       }
       else{
           grade= "Fail!";
       }


        return grade;

    }


}
