package com.javarush.task1kurs.task06.task0605;
/**
 * Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и выводить на экран сообщение о индексе массы тела
 * Реализуй статический метод класса Body
 * Метод должен определить индекс массы тела, и вывести на экран сообщение
 * Недовес: меньше чем 18,5 - если индекс массы тела меньше 18.5
 * Нормальный: между 18.5 и 25 - если индекс массы тела между 18.5 и 25
 * Избыточный вес: между 25 и 30 - если индекс массы тела между 25 и 30
 * Ожирение: 30 или больше - если индекс массы тела больше 30
 * если индекс массы тела = вес в кг /(рост в метрах* рост в метрах)
 */

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите вас вес в кг");
        double weight = Double.parseDouble(reader.readLine());
        System.out.println("Введите ваш рост в метрах");
        double height = Double.parseDouble(reader.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
    public static void calculateMassIndex(double weight, double height) {
        //write this code
        double a = weight / (height * height);
        if (a < 18.5)
            System.out.println("Недовес: меньше чем 18.5");

        if (a > 18.5 && a < 25)
            System.out.println("Нормальный: между 18.5 и 25");

        if (a > 25 && a < 30)
            System.out.println("Избыточный вес: между 25 и 30");

        if (a >= 30)
            System.out.println("Ожирение: 30 или больше");
    }
    }

}
