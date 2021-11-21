package com.javarush.task1kurs.task04.task0442;
//TODO: ввод и вывод по нажатию цифры
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести  с клав числа
 * Если введено -1, то вывести сумму всех введенныъ чисел
 * -1 не учитывать в подсчете
 *
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
        int a = Integer.parseInt(reader.readLine());
        sum += a;
        if (a == -1) {
            break;
        }
    }
        System.out.println(sum);
}
}
