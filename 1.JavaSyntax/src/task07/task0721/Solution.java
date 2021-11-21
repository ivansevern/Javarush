package com.javarush.task1kurs.task07.task0721;

/*
1. Создать массив на 20 чисел
2. Заполнить его числами с клав
3.Найти макс и мин числа в массиве
4. Вывести на экран макс и мин числа через пробел
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] n = getInts();
    //    int maximum;
    //    int minimum;
    //    int [] n = new int[20];
        int maximum = n[0];
        int minimum = n[0];
        //write this code
        for (int i = 0; i < n.length; i++) {
          //  n[i] = Integer.parseInt(reader.readLine());
            if (n[i] > maximum) {
                maximum = n[i];
            }
            if (n[i] < minimum) {
                minimum = n[i];
            }
        }
        System.out.println(maximum + " " + minimum);
    }
    //write this code
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(reader.readLine());
        }
        return  n;
    }
}
