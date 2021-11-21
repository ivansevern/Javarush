package com.javarush.task1kurs.task04.task0417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ввести с клав 3 целых числа
 * определить, имеется ли пара равных чисел между собой
 * если пара суш вывести числа через пробел
 * если все 3 числа равны вывести все 3
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a==b && a==c && b==c) {System.out.println(a+" " + b + " " +c);}
        else if (a==b) {System.out.println(a +" " + b);}
        else if (a==c) {System.out.println(a +" " + c);}
        else if (b==c) {System.out.println(b +" " + c);}

    }
}
