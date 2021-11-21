package com.javarush.task1kurs.task07.task0717;

/*
1. Введи с клав 10 слов в список
2. Метод doubleValues должен удваивать слова по принципу:
   альфа, бета, гамма
   альфа, альфа, бета, бета, гамма, гамма
3. Выведи результат на экран, каждое значение с новой строки
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        //read strings c консоли и объявить ArrayList тут
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());                                                   //1
        }

        ArrayList<String> result = doubleValues(list);
        //вывести на экран result
       for (String a : list) {                                                    //с новой строки каждое слово
            System.out.println(a);                                                //3
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write this code
        for (int i = list.size()-1; i>=0; i--) {                                        //2
            list.add(i, list.get(i));

        }
        return list;
    }
}
