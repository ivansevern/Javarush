package com.javarush.task1kurs.task03.task0304;

/**
 * write method addTenPercent which увеличивает ццелое число на 10%
 */
public class Solution {
    public static double addTenPercent(int i){
        //write this code
        double a = i + (i*0.1);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
