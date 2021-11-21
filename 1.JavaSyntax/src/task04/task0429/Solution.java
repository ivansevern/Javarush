package com.javarush.task1kurs.task04.task0429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав 3 целых числа
 * Вывести кол-во положительных и отрицательных чисел в виде:
 * количество отрицательных чисел: а
 * количество положительных чисел: b
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int countP=0;
        int countM=0;                    //обнуляем счетчики
        if (a>0) {countP++;}             //если положительное для 1
            else if (a<0) {countM++;}    //если отрицательное ддя 1
            if (b>0) {countP++;}         //для 2 числа
             else if (b<0) {countM++;}
             if (c>0) {countP++;}        //для 3 числа
         else if (c<0) {countM++;}
        System.out.println("количество отрицательных чисел: " + countM);
        System.out.println("количество положительных чисел: " + countP);
    }
}
