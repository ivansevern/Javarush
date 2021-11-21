package com.javarush.task1kurs.task04.task0428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав 3 целых числа
 * Вывести кол-во положительных чисел из них
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int count=0;                //инициализурую счетчик
        if (a>0) { count++; }       //выполняю условие
        if (b>0) {count++;}
        if (c>0) {count++;}
        System.out.println(count);
    }
}
