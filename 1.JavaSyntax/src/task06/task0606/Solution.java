package com.javarush.task1kurs.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести  с клав положительное число
 * Определить, сколько в веденном числе четных цифр, а скольконечетных
 * сли число делится без остатка на 2, значит оно четное и увеличиваем на 1 счетчик even
 * иначе на 1 счетчик odd
 * Вывести на экран
 * "Even: a Odd: b"
 * где a - счетчик четных
 * b - счетчик нечетных
 */
public class Solution {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        while (a > 0) {  //если введено больше 0 то работаем
            if (a%2 == 0)
                even++;
            else odd++;
            a=a/10;   //если число разделить на 10
        }
        System.out.println("Even: " +even+" "+ "Odd: "+ odd);

    }
}
