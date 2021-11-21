package com.javarush.task1kurs.task05.task0508;

/**
 * Создать class Person
 * у человека должно быть
 * name String
 * age int
 * sex char
 * Создай геттеры и сеттеры для всех переменных class Person
 */
public class Person {
    //write this code
    String name;      //реализую класс с переменными
    int age;
    char sex;

    public String getName() {   //реализую геттер
        return name;
    }

    public void setName(String name) { //реализую сеттер
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
