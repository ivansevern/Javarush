package com.javarush.task1kurs.task04.task0415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ввести с клав 3 числа a, b, c стороны треугольника
 * Определить возможность существования треугольника по сторонам
 * вывести на экран
 * Треугольник существует
 * Треугольник не существует
 * треуг сущ тогда когда сумма 2 сторон больше 3
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a+b > c & a+c > b & b+c > a) System.out.println("Треугольник существует");
        else System.out.println("Треугольник не существует");
    }
}
