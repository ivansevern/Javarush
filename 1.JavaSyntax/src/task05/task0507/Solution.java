package com.javarush.task1kurs.task05.task0507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Вводить с клавиатуры числа и вычислить среднее арифмитическое
 * Если введено -1 вывести на экран сред ариф всех чисел и завершить
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;  //обнуляю счетчики
        double sum =0;

        while (true) {
            int in = Integer.parseInt(reader.readLine());
            if (in == -1) {         //если выводим сообщение
                System.out.println(sum/count);
              return;
            }
            count++;           //пока не введено -1 считаем
            sum+=in;
        }
    }
}

