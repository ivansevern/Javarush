package com.javarush.task1kurs.task04.task0418;
//TODO: ввод 2 чисел и вывод мин из них
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ввести с клав 2 целых числа и вывести минимальное из нх
 * если 2 числа равны вывести любое
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int min = a<b ? a:b;    //условие если a<b ? - если правда то выполняется условие слево, спава если ложь
        System.out.println(min);
    }
}
