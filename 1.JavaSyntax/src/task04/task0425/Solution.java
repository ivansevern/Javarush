package com.javarush.task1kurs.task04.task0425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав 2 целых числа, которые будут координатами точки, не лежахей на осях координат OX и OY
 * вывести номер координатной четверти, в которой находится точка
 *
 * для 1 четверти - a>0 и b>0
 * для 2 четверти - a<0 и b>0
 * для 3 четверти - a<0 и b<0
 * для 4 четверти - a>0 и b<0
 *
 * для
 * 46 - 1
 * -6-6 - 3
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a>0 & b>0) {
            System.out.println(1);}
        else if (a<0 & b>0) {
            System.out.println(2);}
        else if (a<0 & b<0) {
            System.out.println(3);}
        else if (a>0 & b<0) {
            System.out.println(4);}
    }
}
