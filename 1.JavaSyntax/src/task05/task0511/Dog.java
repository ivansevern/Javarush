package com.javarush.task1kurs.task05.task0511;

/**
 * Создать class Dog с 3 инициализаторами
 * Имя
 * Имя, рост
 * Имя, рост, цвет
 */
public class Dog {
    //write this code
    public String name;
    public int height;
    public String color;

    public void initialize(String name) {
        this.name = name;
        this.height = 1;
        this.color = "black";
    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
        this.color = "black";
    }

    public Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
