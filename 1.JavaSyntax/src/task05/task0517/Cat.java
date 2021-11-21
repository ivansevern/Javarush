package com.javarush.task1kurs.task05.task0517;

/**
 * Создать class Cat с 5 конструкторами
 * Имя
 * Имя, вес, возвраст
 * Имя, возвраст (вес стандартный)
 * вес, цвет (имя, адрес, возвраст неизвестные, кот бездомный)
 * вес, цвет, адрес (чужой домашний кот)
 * Задача конструктора сделать объект валидным
 */
public class Cat {
    //write this code
   public String name;
   public int age;
   public int weight;
   public String adress;
   public String color;

    public Cat(String name) {
        this.age = 5;
        this.name = name;
        this.weight = 5;
        this.color = "black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "black";
    }

    public Cat(int weight, String color) {
        this.age = 5;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String adress) {
        this.age = 5;
        this.weight = weight;
        this.adress = adress;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
