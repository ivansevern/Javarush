package com.javarush.task1kurs.task04.task0443;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав строку name
 * Ввестис клав дату рождения (год, месяц, день)
 * Вывести
 * Меня зовут name
 * Я родился
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String d = reader.readLine();
        String m = reader.readLine();
        String y = reader.readLine();
        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился " +d+ "." +m +"."+y);

    }
}
