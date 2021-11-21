package com.javarush.task1kurs.task07.task0708;
//TODO: вывод мак длинных строк ArrayList
/*
1. Создать список строк
2. Считай с клавиатуры 5 строк и добавь в список
3. Циклом найди самую длинную строку в списке
4. Выведи найденную строку, если несколько вывести все с новой строки
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();       //1
        for (int i = 0; i < 5; i++) {
           strings.add(reader.readLine());                   //2
        }
        int maxLength = strings.get(0).length();             //3
        for (String string : strings) {
            if (string.length()>maxLength){
                maxLength = string.length();
            }
          }
        for (String tring : strings) {                      //4
            if (tring.length() == maxLength) {
                System.out.println(tring);
            }
        }
    }
}

