package com.kaustubh;

public class Conditionals {
    public static void main(String[] args) {

        /*
            Syntax of if statements:
            if(boolean expressions T or F){
                    //body
                 } else {
                    //do this

                 }

        */

        int salary = 33000;
//        if (salary > 20000) {
//            salary = salary + 5000;
//        } else {
//            salary = salary + 2500;
//        }
                //multiple if-else statements

        if (salary > 15000){
            salary += 3500; // salary = salary+3500
        } else if (salary > 25000) {
            salary += 4500;
        } else{
            salary += 5500;

        }

        System.out.println(salary);

    }
}