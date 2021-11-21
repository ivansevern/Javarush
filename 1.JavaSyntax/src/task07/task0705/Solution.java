package com.javarush.task1kurs.task07.task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 20 чисел
 * 2. Ввести в него знач с клав
 * 3. Создать 2 массива на 10 чисел каждый
 * 4. Скопировать большой массив в 2 маленьких:
 *    половину чисел в 1 маленький, вторую во 2 маленький
 * 5. Вывести второй маленький массив на экран
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];  //1
        int[] b = new int[10];  //3
        int[] c = new int[10];  //3
        for (int i = 0; i < 20; i++) {    //2
            a[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 10; i++) {   //4
            b[i] = a[i];
            c[i] = a[i+10];
            System.out.println(c[i]);    //5
        }
    }
}
