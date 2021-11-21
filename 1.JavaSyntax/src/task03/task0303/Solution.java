package com.javarush.task1kurs.task03.task0303;

public class Solution {
    public static void main(String[] args) {
        //write this code
        System.out.println(convertEurToUsd(1, 10));
        System.out.println(convertEurToUsd(10, 10));
    }

    public static double convertEurToUsd(int eur, double exchangeRate){
        //write this code
       double out = eur * exchangeRate;
               return out;
    }
}
