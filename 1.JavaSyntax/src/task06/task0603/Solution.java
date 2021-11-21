package com.javarush.task1kurs.task06.task0603;

/**
 * Создать в цикле по 50000 объектов Cat и Dog
 *
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
        for (int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A dogwasdestroyed");
    }
}