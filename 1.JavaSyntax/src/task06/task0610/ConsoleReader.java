package com.javarush.task1kurs.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Сделать класс ConsoleReader, у которого будут 4 статических метода
 * String readString() - читает с клав строку
 * int readInt() - читает с клав число
 * readDouble() - читает с клав дробное число
 * readBoolean() - читает с клав строку true или false и возвращает соответствующую логическую переменную true или false
 * Создавай переменную для чтения данных с консоли BuferReader или Scaner внутри каждого метода
 */
public class ConsoleReader {
    public static String readString() throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         return reader.readLine();
    }

    public static int readInt() throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static double readDouble() throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());

    }

    public static boolean readBoolean() throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return  Boolean.parseBoolean(reader.readLine());

    }

    public static void main(String[] args) {

    }
}
