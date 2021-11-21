package com.javarush.task1kurs.task04.task0409;
//TODO: вывод ближайшего число к 10
/**
 * Метод должен выводить на экран ближайшие к 10 из 2 чисел, записанных в аргументах метода
 */
public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7,14);

    }
    public static void displayClosestToTen(int a, int b){
/*
        //write this code
        if ((abs(a - 10)) < (abs(b - 10))) {
            System.out.println(a);
        }
        if ((abs(a - 10)) > (abs(b - 10))) {
            System.out.println(a);
        }
        if ((abs(a - 10)) == (abs(b - 10))) {
            System.out.println(a+" "+b);
        }
*/
        if (abs(a-10)<abs(b-10))
            System.out.println(a);
        else
            System.out.println(b);

    }
    public static int abs(int a){
        if (a < 0) {
            return -a;
        }
        else {
            return a;
        }
    }
}
