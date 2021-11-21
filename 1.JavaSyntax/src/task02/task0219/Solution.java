package com.javarush.task1kurs.task02.task0219;
//TODO: print вывод на экран
/*
The method should display the passed(word) on the screen 3 times separated by a space
 */
public class Solution {
    public static void print3(String text){
        //write this code

            System.out.println(text + " "+ text + " " + text);

    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
