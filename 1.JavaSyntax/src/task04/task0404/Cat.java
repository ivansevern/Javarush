package com.javarush.task1kurs.task04.task0404;

/**
 * Написать код в методе addNewCat
 * чтобы при его вызове кол-во котов увеличивалось на 1
 * за кол-во котов отвечает переменная catsCount
 */
public class Cat {
    private static int catsCount = 0;

    public static void addNewCat(){
        //write this code
        Cat.catsCount = catsCount+1;   // присваиваем ссылку переменной и прибавляем
    }

    public static void main(String[] args) {


    }
}
