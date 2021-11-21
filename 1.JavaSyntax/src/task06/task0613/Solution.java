package com.javarush.task1kurs.task06.task0613;

/**
 * В class Cat создай статич переменную public int Catcount
 * Создай конструктор public Cat()
 * Пусть при каждом создании кота статич переменная Catcount увеличивается на 1
 * Создать 10 объектов Cat и вывести значение переменной Catcount на экран
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
        for (int i = 0; i < 10; i++)
            new Cat();
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        //write this code
        public static int catCount = 0;

        public Cat() {
            catCount++;
        }
    }
}
