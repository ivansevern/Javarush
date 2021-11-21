package com.javarush.task1kurs.task07.task0701;
//TODO: создание маасива из 5 и вывод мах
/*
1. In tehe initializeArray() method:
1.1. Create an array of 20 numbers
1.2. Read 20 numbers from the console and fill them with an array
2. The max(int[] araay) method must find the maximum number of array elements
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // create and fill an array создай и запол массив
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in)); // считываем с клавиатуры
        int[] array = new int[5];               //задаем массив из 5 цифр
        for (int i = 0; i < 5; i++) {   // задаем ввод массива до 5 цифр
            array[i] = Integer.parseInt(a.readLine());      // присваиваем массив
        }
        return array;                             // возвращаем массив
    }

        public static int max ( int[] array){
            // find max value
            int max = array[0];
            for (int i = 1; i < 5; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
                return max;
            }
        }

