package com.javarush.task1kurs.task03.task03141;
//TODO: вывод таблицы умножения циклом 10х10
/**
 * вывести на экран таблицу умножения 10х10
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
        int i, j;
        for ( i=1; i<11; i++) {

            for ( j =1; j<11; j++) {
                System.out.print(j * i + " ");

            }System.out.println();
        }
    }
}
