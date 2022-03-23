package com.company;

import java.util.Arrays;

public class ArrayUebungenSelbstgemacht {
    public static void main(String[] args) {

        String [] tage={"MO","DI","MI", "DO","FR","SO","SA"}; //brzi nacin inicijalizacije i deklaracije

        String[] facher;

        facher=new String[5]; //spori nacin deklaracija pa inicijalizacija, ali ovo je nekad neophodno
        facher [0]="Mhate";
        facher [1]="Deutsch";
        facher [2]="Englisch";
        facher [3]="Sport";
        facher [4]="Wirtschaft";

        for(int i=0; i<facher.length; i++) {  //Ovako ispisati sadrzaj array
            System.out.println(facher[i]);
            //System.out.println(Arrays.toString(facher[i])); Zasto ovo ne moze?????
        }

        String [][] wochenPlan = {{"MO","DI","MI", "DO","FR","SO","SA"},
                                 {"Mhate","Deutsch","Englisch", "Sport", "Wirtschaft"}};

        System.out.println(wochenPlan[2][2]);             //zelim ispisati Englisch

    }


}
