package com.javarush.task1kurs.task04.task0413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав номер дня недели
 * в зависимости от номера вывести название
 * понедельник
 * вторник
 * среда
 * четверг
 * пятница
 * суббота
 * воскресенье
 * если больше 7 или меньше 1 вывести
 * такого дня не существует
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n == 1) System.out.println("понедельник");
        else if (n == 2) System.out.println("вторник");
        else if (n == 3) System.out.println("среда");
        else if (n == 4) System.out.println("четверг");
        else if (n == 5) System.out.println("пятница");
        else if (n == 6) System.out.println("суббота");
        else if (n == 7) System.out.println("воскресенье");
        else System.out.println("такого дня не существует");
    }
}
