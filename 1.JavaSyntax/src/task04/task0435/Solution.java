package com.javarush.task1kurs.task04.task0435;

/**
 * Циклом FOR вывести четные числа от 1 до 100
 * каждое с говой строки
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0)
            System.out.println(i);

        }
    }
}
   //   for (int i = 1; i <= 100; i+=2) {System.out.println(i);