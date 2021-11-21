package com.javarush.task1kurs.task05.task0514;

/**
 * Изучи class Person
 * Исправь класс так, чтобы только 1 метод initialize инициализировал все переменные класса человек
 */
public class Person {
    String name;
    char sex;
     int money;
     int weight;
     double size;

/*    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }*/

    public void initialize(String name, char sex, int money, int weight, double size) {
        this.name = name;
        this.sex = sex;
        this.money = money;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}
