package com.javarush.task1kurs.task07.task0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

/**
 * 1. Создать массив на 10 строк
 * 2. Создать массив на 10 чисел
 * 3. Ввести с клав 10 строк, заполнить ими массив строк
 * 4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
 *    которой совпадает с текущим индексом из массива чисел
 * Вывести содержимое массива чисел на экран с новой строки каждое значение
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10]; //1
        int[] num = new int[10];       //2
        for (int i = 0; i < 10; i++) { //3
            str[i] = reader.readLine();
        }
        for (int i = 0; i < 10; i++) { //4
            num[i] = str[i].length();
            System.out.println(num[i]);
        }
    }
}
