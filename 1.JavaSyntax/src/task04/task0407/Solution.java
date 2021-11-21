package com.javarush.task1kurs.task04.task0407;
//TODO: счетчик
/**
 * Написать код чтобы правильно считалось кол-во созданных котов(count)
 * и на экран выводилось их правильное кол-во
 */
public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //wwrite this code
        Cat.count++;
        Cat cat2 = new Cat();
        //write this code
        Cat.count++;
        System.out.println("The catcount is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
