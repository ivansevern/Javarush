package com.javarush.task1kurs.task07.task0719;

/*
1. Ввести с клав 10 чисел и заполнить ими список
2. Вывести их в обратном порядке. Каждый элемент с новой строки
 Использовать только цикл for
 */
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //write this code
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));           //1
        }
        for (int i = list.size()-1; i >=0 ; i--) {                   //2
            System.out.println(list.get(i));
        }
    }
}
