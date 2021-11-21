package com.javarush.task1kurs.task02.task0202;
/*
В классе Person объяви следующие переменные:
name типа String,
age типа int,
weight типа int,
money типа int.
В методе main создай объект Person, занеси его ссылку в переменную person.
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
//создаю пременную person типа Person (Person person) и объект Person (new Person())
//присваиваю переменную ссылку на объект
        Person person = new Person();
    }
    public static class Person{
        //write this code
        String name; //объявляю переменную
        int age, weight, money; //объявляю переменную
    }
}
