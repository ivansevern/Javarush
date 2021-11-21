package com.javarush.task1kurs.task03.task0308;
//TODO: вывод решний циклом
/*
вывусти произведение чисел от 1 до 10
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
        int num = 1;
        for (int i = 1; i < 11; i++) {
        num = num*i;
        }
        System.out.println(num);
    }
}
