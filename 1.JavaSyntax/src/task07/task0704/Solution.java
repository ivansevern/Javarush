package com.javarush.task1kurs.task07.task0704;
//TODO: заполнение массива и вывод в обратном порядке
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 10 чисел
 * 2. Ввести с клав 10 чисел и записать их в массив
 * 3. вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        int[] num = new int[10];  //1
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {                    //2
            num[i] = Integer.parseInt(reader.readLine());
        }
        for (int  i = num.length-1; i>=0; i--) {         //3
            System.out.println(num[i]);
        }
    }
}
