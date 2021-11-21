package com.javarush.task1kurs.task04.task0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ВВести с клав целое число
 * вывести надпись строку описание следующего вида
 * Отрицательное число
 * Отрицательное нечетное число
 * ноль
 * Положительное четное число
 * Положительное нечетное число
 *
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a<0 && a%2==0) System.out.println("Отрицательное число");
        else if (a<0 && a%2!=0) System.out.println("Отрицательное нечетное число");
        else if (a==0) System.out.println("ноль");
        else if (a>=0 && a%2==0) System.out.println("Положительное четное число");
        else if (a>=0 && a%2!=0) System.out.println("Положительное нечетное число");
    }
}
