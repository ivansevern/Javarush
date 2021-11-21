package com.javarush.task1kurs.task04.task0416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа
 * Определить, сигнал какого цвета горит, вывести на экран
 * сначала горит зеленый 3 минуты с начала часа
 * потом 1 минута желтый
 * потом 1 минута красный
 *
 * зелёный - для зелёного
 * желтый
 * красный
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        t = t % 5;                                           // режим делим на 5 минут
        if (t>=0 && t < 3) {System.out.println("зелёный");}  // если от 0 до 3 минут то горит зеленый
        else if (t>=3 && t < 4) {System.out.println("желтый");}
        else {System.out.println("красный");}
    }
}
