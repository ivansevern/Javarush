package com.javarush.task1kurs.task07.task0714;
/*
1. Создать массив на 5
2. Удалить 3 эелемент
3. вывести в обратном порядке
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();    //1
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());               //
        }
        list.remove(2);                          //2 - отсчет от 0 в массиве
        for (int i = list.size()-1; i>=0; i--) {       //3
            System.out.println(list.get(i));
        }
    }
}
