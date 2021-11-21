package com.javarush.task1kurs.task05.task0529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Вводить с клавиатуры числа и считать их сумму, пока не введешь слово "сумма"
 * Вывести на экран полученную сумму
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int sum = 0;
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                System.out.println(sum);
            break;
        }
        else
            {
            a = Integer.parseInt(s);
            sum += a;
            }
       }
    }
}

/*
2

int sum = 0;
 while (true) {
   String s = reader.readLine();
   if (s.equals("exit)) {
   System.out.println(sum);
   return;
   }
   int a = Integer.parseInt(s);
            sum += a;
 */