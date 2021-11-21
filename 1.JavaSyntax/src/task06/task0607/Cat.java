package com.javarush.task1kurs.task06.task0607;

/**
 * Создать статическую переменную Int catCount в классе Cat
 * Создай конструктор [public Cat()], в котором увеличивай счетчик на 1
 */
public class Cat {
    //wwrite this code
   static int catCount =0; //создаю статическую переменную

    public Cat() {
        catCount++;
    }

    public static void main(String[] args) {

    }
}
