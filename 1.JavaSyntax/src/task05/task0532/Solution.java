package com.javarush.task1kurs.task05.task0532;
//TODO: ввод числа вводов чисел
/**
 * Написать программу, которая
 * 1. считывает с консоли число N, которое должно быть больше 0
 * 2. потом считывает N чисел с консоли
 * 3. выводит на экран максимальное из введенных N чисел
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //write this code
        int N = Integer.parseInt(reader.readLine());
        if (N<= 0){
            return;
        }
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(reader.readLine());
            }
        int maximum = data[0];
        for (int i = 1; i < N; i++) {
            if (data[i] > maximum) {
                maximum = data[i];
        }
        }
        System.out.println(maximum);
    }
}
