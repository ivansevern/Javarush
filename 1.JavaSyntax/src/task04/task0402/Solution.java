package com.javarush.task1kurs.task04.task0402;

/**
 * Посчитай суммарную стоимость яблок
 * За суммарную стоимость яблок отвечает переменная public static int applesPrice
 */
public class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple{
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice){
            //write this code
            Apple.applesPrice = applesPrice+applesPrice;
        }
    }
}
