package com.javarush.task1kurs.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Создай список строк
2. Добавь в него 10 строк с клав, но добавлять не в конец, а в начало
3. Циклом вывести содержимое на экран
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        //write this code
        ArrayList<String> list = new ArrayList<>();                                     //1
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   
        for (int i = 0; i < 10; i++) {
            list.add(0, reader.readLine());                                       //2
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
