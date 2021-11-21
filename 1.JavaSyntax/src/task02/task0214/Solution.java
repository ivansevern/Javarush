package com.javarush.task1kurs.task02.task0214;

/**
 * Write function, which return min of 2 numbers
 */
public class Solution {
    public static int min(int a, int b){
        //write this code
        if (a<b)
            return a;
        else return b;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));

    }
}
