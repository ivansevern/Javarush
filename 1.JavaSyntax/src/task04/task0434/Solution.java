package com.javarush.task1kurs.task04.task0434;

/**
 * вывести таблицу умножения 10х10 цикллом while
 */
public class Solution {
    public static void main(String[] args) {
        //wwrite this code
        int i = 1;          //начинаем с 1
        while (i<=10) {     //если меньше 10 то начинаем
            int j =1;       //
                   while (j<=10) {   //
            System.out.print(i*j);   //вывожу строку от 1 до 10
                       System.out.print(" ");
            j++;
        }
            System.out.println();
                   i++;}
    }
}
