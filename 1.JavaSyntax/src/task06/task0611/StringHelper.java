package com.javarush.task1kurs.task06.task0611;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Сделать class StringHelper, у которого будут 2 статических метода
 * String multiply(String text) - возвращает строку повтореную 5 раз
 * String multiply(String text, int count) - возвращает строку повторенную count раз
 */
public class StringHelper {
    public static String multiply(String text) {
      //  String result = "";
        //write this code
        return multiply(text,5);
    }

    public static String multiply(String text, int count) {
      //  String result = "";
        //write this code
       StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(text);
        }

        return s.toString();
    }

    public static void main(String[] args) {

    }
}
