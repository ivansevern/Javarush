package com.javarush.task1kurs.task02.task0218;

/**
 * Method print3 display 3 times
 */
public class Solution {
    public static void print3(String text){
        //write this code
        for (int i = 1; i <= 3 ; i++)
       System.out.println(text);

    }

    public static void main(String[] args) {
        print3("I love you");
    }
}
