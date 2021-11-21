package com.javarush.task1kurs.task06.task0609;

/**
 * Реализовать метод double getDistance(int x1, int y1, int x2, int y2)
 * Он должен вычислять расстояния между точками
 * Используй метод double Math.sqrt(double a), который вычисляет корень квадратный переданного параметра
 */
public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write this code
        double a = Math.sqrt(((x2 - x1) * (x2 - x1) + ((y2 - y1) * (y2 - y1))));
        return a;
    }

    public static void main(String[] args) {

    }
}
