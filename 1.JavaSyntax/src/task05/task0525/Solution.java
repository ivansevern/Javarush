package com.javarush.task1kurs.task05.task0525;

/**
 * По анологии с классом Duck создай class Cat и Dog
 * Подумай, что должен возвращать метод toString в классах Cat и Dog
 * В метод main создай по 2 объекта каждого класса и выведи их на экран
 * Объекты класса Duck уже созданы и выводятся на экран
 */
public class Solution {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);
        //wwrite thiscode
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    //write this code
    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
}
