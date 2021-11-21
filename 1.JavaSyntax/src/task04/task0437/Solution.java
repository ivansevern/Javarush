package com.javarush.task1kurs.task04.task0437;
//TODO: вывести треугольник из 8 10х10 циклом for
/**
 * Используя цикл For
 * вывести треугольник из 8 10х10
 */
public class Solution {
    public static void main(String[] args)  {
        //write this code
        int a = 10;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('8');
            }
            System.out.println();


        }
    }
}
