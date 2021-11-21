package com.javarush.task1kurs.task04.task0419;
//TODO: ввод 4 чисел и вывод мин из них
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести 4 числа и вывести макс из них
 * если числа равны вывести любое
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write tis code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int max1 = a>b ? a:b;
        int max2 = c>d ? c:d;
        int max = max1>max2 ? max1:max2;
        System.out.println(max1);
    }
}
