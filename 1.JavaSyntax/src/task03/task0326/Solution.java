package com.javarush.task1kurs.task03.task0326;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsNumbers(546));
    }
    public static int sumDigitsNumbers(int number){
        //write this code
        int sum1, sum2,sum3,sum4;
      //  int sum = 0;
      /*  sum = sum + number %10;
        number = number / 10;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        return sum;*/
        sum1 = number/100;
        sum2 = number%100/10;
        sum3 = number%10;

        return sum1+sum2+sum3;

    }
}
