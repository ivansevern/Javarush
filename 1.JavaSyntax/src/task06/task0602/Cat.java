package com.javarush.task1kurs.task06.task0602;

/**
 * В каждом классе Cat и Dog написать метод finalize
 * который выводит на экран текст о то, что такой-то объект уничтожен
 */
public class Cat {
    public static void main(String[] args) {

    }

    //write this code
    protected void finalize() throws Throwable {
        System.out.println("Cat destroyed");
    }
}
    class Dog {
        //write this code
        protected void finalize() throws Throwable {
            System.out.println("Dog destroyed");
        }
}

