package com.javarush.task1kurs.task05.task0531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Программа вводит2 числа с клав и выводит минимальное из них
 * переделать чтобы
 * прогрпммавводит 5 чисел с клав и выводит минимальное из них
 */
public class Solution {
    public static void main(String[] args) throws IOException {
      /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);
        System.out.println("Minimum = " + minimum);
    }
    public static int min(int a, int b) {
        return a<b ? a:b;
    }*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);
        System.out.println("Minimum = " + minimum);
    }
    public static int min(int a, int b, int c, int d, int e) {
        int m = a;
        if (a >= b) m = b;
        if (m >= c) m = c;
        if (m >= d) m = d;
        if (m >= e) m = e;
        return m;
    }
}


/*
public static int min(int a, int b, int c, int d, int e) {
return min(min(a, b), min(c, d), e));
}
public static int min(int a, int b, int c, int d, int e) {
return a<b ? a:b;
}
}
 */