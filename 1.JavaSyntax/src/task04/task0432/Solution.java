package com.javarush.task1kurs.task04.task0432;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав строку N больше 0
 *Вывести строку N раз используя цикл While
 * каждый раз с новой строки
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int N = Integer.parseInt(reader.readLine());
        while (N>0) {                //если число больше 0
            System.out.println(str); //то выводим сообщение
            N--;                     //от введенного числа до 1
        }
    }
}
