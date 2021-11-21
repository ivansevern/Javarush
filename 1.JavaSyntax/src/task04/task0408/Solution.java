package com.javarush.task1kurs.task04.task0408;
//TODO: if else
/**
 * написать метод compare(int number) чтобы он
 * выводил на экран строку
 * ЧИСЛО МЕНЬШЕ 5
 * ЧИСЛО БОЛЬШЕ 5 если больше 5
 * ЧИСЛО РАВНО 5
 */
public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int number){
        //write this code
        if (number<5)
            System.out.println("ЧИСЛО МЕНЬШЕ 5");
       else if (number>5)
            System.out.println("ЧИСЛО БОЛЬШЕ 5");
       else   if (number == 5)
            System.out.println("ЧИСЛО РАВНО 5");
    }
}
