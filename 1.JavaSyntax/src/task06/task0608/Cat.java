package com.javarush.task1kurs.task06.task0608;

/**
 *получить количество котов
 */
public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        //write this code
        return catCount;
    }

    public static void setCatCount(int catCount) {
        //write this code
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {

    }

}
