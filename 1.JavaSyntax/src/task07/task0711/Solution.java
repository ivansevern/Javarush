package com.javarush.task1kurs.task07.task0711;

import LessonsJava.Chapter5.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Создать список строк
2. Добавить туда 5 строк с клав
3. Выполнить 13 раз: удалить последнюю строку и вставить ее в начало
4. Циклом вывести содержимое результирующего списка на экран
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Object> list = new ArrayList<>();             //1
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());                        //2
        }
        for (int i = 0; i < 13; i++) {                          //3

           String l = (String) list.remove(4);
            list.add(0, l);
        }
        for (Object r : list) {                                //4
            System.out.println(r);
        }
    }
}
