package com.javarush.task1kurs.task03.task0312;

/**
 * Add method public static int convertToSeconds(int hour)
 * which should covert hours to sec
 * Вызови его 2 раза в методе main с люьыми параметрами
 * результат вывести на экран каждый раз сновой строки
 */
public class Solution {
    //write this code
    public static int convertToSeconds(int hour) {

        int out = hour * 3600;
        return out;
    }

        public static void main (String[]args){
            //write this code
            System.out.println(convertToSeconds(1));
            System.out.println(convertToSeconds(10));
        }
    }
