package com.javarush.task1kurs.task05.task0503;
//TODO: Гетры и Сетеры для класса
/**
 * Создай класс DOG
 * У собаки должна быть кличка String name и возвраст int Age
 * Создай геттеры и сеттеры для всех переменных класса Dog
 */
public class Dog {
    //write this code
    public String name;    //создаю переменные
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }
    public static void main(String[] args) {

    }
}
