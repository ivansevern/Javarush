package com.javarush.task1kurs.task04.task0436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав 2 числа m и n
 * Используя цикл For вывести прямоугольник размером m*n из 8
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {     //1 цикл для 1 числа
            for (int j = 0; j < n; j++) { //2 цикл для 2 числа
                System.out.print('8');    //вывод стоки с 8 (для 1 числа)
            }
            System.out.println();         //вывод стоки с 8 (для 2 числа)
        }
    }
}
