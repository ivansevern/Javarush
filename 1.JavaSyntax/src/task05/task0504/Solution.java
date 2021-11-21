package com.javarush.task1kurs.task05.task0504;
//TODO: конструктор для класса
/**
 * Создать 3 кота по шаблону
 * Наполнить котов данными
 */

public class Solution {
    public static void main(String[] args) {
        //write this code
        Cat cat1 = new Cat("cat1", 3, 2, 3); //создаю кота1 по шаблону класса с параметрами
        Cat cat2 = new Cat("cat2", 2, 1, 2);
        Cat cat3 = new Cat("cat3", 1, 4, 4);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strenght;


        public Cat(String name, int age, int weight, int strenght) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strenght = strenght;
        }
    }
}
