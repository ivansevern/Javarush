package com.javarush.task1kurs.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Ввели с клав 10 слов в список строк
2. Определить, является ли список упорядоченным по возврастанию длины строки
3. В случае отрицательного ответа вывести на экран индекс 1 элемента, нарушающего такую упорядоченность
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());                                  //1
        }
        for (int i = 0; i < list.size()-1;  i++) {                        //2
            if (list.get(i).length() > list.get(i + 1).length()) {
                System.out.println(i+1);                                  //3
                break;
            }
        }
    }
}

