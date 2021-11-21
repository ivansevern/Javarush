package com.javarush.task1kurs.task05.task0514;

/**
 * Создать class Person
 * У человека должно быть:
 * String name
 * int age
 * Добавь метод initialize(String name, int age) в котором проинициализируешь переменные name и age
 * В методе main создай объект Person, занеси его ссылку в переменную рerson
 * Вызови метод initialize с любыми значениями
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
        Person person = new Person();             //создаю объект
        person.initialize("Ivan", 37);  //вызываю со значениями
    }

    static class Person {
        //write this code
        public String name; //даю поля
        public int age;


        public void initialize(String name, int age) { //инициализирую переменные
            this.name = name;
            this.age = age;
        }
    }

}
