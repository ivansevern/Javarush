package com.javarush.task1kurs.task06.task0604;

/**
 * В конструкторе класса Cat[public Cat()]
 * увеличить счетчик котов на 1
 * В методе finalize уменьшать на 1
 */
public class Cat {
    public static int catCount = 0;

    public Cat() {
        catCount++;
    }
    //write this code

    protected void finalize() throws Throwable {
        catCount--;
    }
    public static void main(String[] args) {

    }
}
