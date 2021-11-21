package com.javarush.task1kurs.task04.task0433;
//TODO: Вывести квадрат из 10х10 букв S используя цикл While
/**
 * Вывести квадрат из 10х10 букв S используя цикл While
 */
public class Solution {
    public static void main(String[] args) {
       int i =0;          //обнуляем для строки
       while (i<10) {     //начинаем цикл для кол-ва букв от 10
           int j = 0;     //обнуляем для кол-ва строк
           while (j<10) { //начинаем цикл для кол-ва строк от 10
               System.out.print("$"); //выводим букву в строку
               j++;                   //букву до 10
           }
           System.out.println();      //выводим строку с буквами от 1 цикла
           i++;
       }

    }
}
