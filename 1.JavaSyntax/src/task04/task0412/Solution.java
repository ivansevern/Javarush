package com.javarush.task1kurs.task04.task0412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав число
 * если число положительное, то увеличить его в 2 раза
 * если число отрицательное, то прибавить 1
 * если число равное 0, то вывести 0
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a > 0)
        //    a = a*2;
        System.out.println(a*2);
        else if (a < 0)
          //  a = a++;
        System.out.println(++a);
        else
          //  a = 0;
            System.out.println(a);

    }
}
