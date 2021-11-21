package com.javarush.task1kurs.task06.task0622;

/*
Write a program that enters from the keyboard 5 numbers and displays them in an increasing order.
input Example:
3
2
15
6
17
Output Example:
2
3
6
15
17
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        // write this code

        int[] array = new int[5];
        for (int i =0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine()); }
        for (int n = array.length-1; n>0; n--) {
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i+1]) {
                    int sort = array[i];
                    array[i] = array[i+1];
                    array[i+1] = sort;

                }
            }
        }
        for (int i:array) {
            System.out.println(i);
        }
    }
}

