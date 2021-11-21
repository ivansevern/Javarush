package com.javarush.task1kurs.task03.task0311;
//TODO: выод на экран с изменение через метод
/**
 * реализуй метод  public static void writeToConsole(String s)
 * который добавляет к началу строки выражение printing
 * и выводит измененную строку на экран
 */
public class Solution {
    public static void main(String[] args) {
        writeToConsole("Hello");
    }

    public static void writeToConsole(String s){
        //write this code
        System.out.println("printing " + s);
    }
}
