package com.javarush.task1kurs.task04.task0424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав 3 целых числа
 * Одно число отличается от дугих, равных между собой
 * Вывести порядковый номер числа отличного от других
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write tis code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        if (number1 == number2 & number2 != number3) {
            System.out.println(3);}
        else if (number2 ==number3 & number3 != number1) {
            System.out.println(1);}
        else if (number1 == number3 & number1 != number2) {
            System.out.println(2);}
    }
}
