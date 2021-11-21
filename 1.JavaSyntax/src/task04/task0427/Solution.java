package com.javarush.task1kurs.task04.task0427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав целое число в диапазоне 1-999
 * вывести описание:
 * четное однозначное число
 * нечетное однозначное число
 * четное двузначное число
 * нечетное двузначное число
 * четное трехзначное число
 * нечетное трехзначное число
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a>0 && a<10 && a%2==0) System.out.println("четное однозначное число");
        else if (a>0 && a<10 && a%2!=0) System.out.println("нечетное однозначное число");
        else if (a>9 && a<100 && a%2==0) System.out.println("четное двузначное число");
        else if (a>9 && a<100 && a%2!=0) System.out.println("нечетное двузначное число");
        else if (a>99 && a<1000 && a%2==0) System.out.println("четное трехзначное число");
        else if (a>99 && a<1000 && a%2!=0) System.out.println("нечетное трехзначное число");
    }
}
