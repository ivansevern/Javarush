package com.javarush.task1kurs.task05.task0516;

/**
 * Создать class Friend с 3 конструкторами
 * Имя
 * Имя, возвраст
 * Имя, возвраст,пол
 */
public class Friend {
    //write this code
    String name;
    int age;
    char sex;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public static void main(String[] args) {

    }
}
