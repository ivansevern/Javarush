package com.javarush.task1kurs.task05.task0518;

/**
 * Создать class Dog с 3 конструкторами
 * 1 Имя
 * 2 Имя, рост
 * 3 Имя, рост, цвет
 */
public class Dog {
    //write this code
    public String name;
    public int height;
    public String color;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}
