package com.javarush.task1kurs.task04.task0439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав имя и циклом For 10 раз вывести
 * <name>любит меня
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня");
        }
    }
}
