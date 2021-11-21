package com.javarush.task1kurs.task07.task0720;

/*
1. Ввести с клав 2 числа N и M
2. Ввести N строк и заполнить ими список
3. Переставить М первых строк в конец списка
4. Вывести список на экран, каждое значение с новой строки
Больше 1 списка не создавать!
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //write this code
        ArrayList<String> list = new ArrayList<>();
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());           //1
            for (int i = 0; i < n; i++) {                          //2
                String s = reader.readLine();
                list.add(s);
            }
        for (int i = 0; i < m; i++) {                              //3
            list.add(list.remove(0));
        }
        for (String s : list) {                                    //4
            System.out.println(s);
        }
    }
}
