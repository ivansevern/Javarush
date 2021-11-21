package com.javarush.task1kurs.task07.task0709;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Создай список строк
2. Считай с клав 5 строк и добавь в список
3. Используй цикл, найди самую короткую строку в списке
4. Выведи на экран
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();  //1
        for (int i = 0; i < 5; i++) {                //2
            list.add(reader.readLine());
        }
        int m = list.get(0).length();                //3
        for (String l : list){
            if (l.length() < m) {
                m = l.length();
            }
        }
        for (String l : list) {                      //4
            if (l.length() == m) {
                System.out.println(l);
            }
        }
    }
}
