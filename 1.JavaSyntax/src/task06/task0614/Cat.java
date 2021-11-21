package com.javarush.task1kurs.task06.task0614;


import java.util.ArrayList;

/**
 * В class Cat добавь публичную статич переменную cats(ArrayList<Cat>)
 * Пусть при каждом создании кота в переменную cats добавляется этот новый кот
 * Создать 10 котов
 * Метод printCats должен выводить всех котов на экран
 * Нужно использовать переменную cats
 */
public class Cat {
    // write this code
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {

    }
    public static void main(String[] args) {
        // write this code
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());   //
        }
        printCats();
    }
    public static void printCats() {
        // write this code
        for (int i = 0; i < 10; i++) {
            System.out.println(cats.get(i));
        }
    }
}

