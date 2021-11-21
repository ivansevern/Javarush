package com.javarush.task1kurs.task07.task0707;
//TODO: добавление строк в ArrayList
import java.util.ArrayList;

/*
1. Создай спиок строк
2. Добавь в него 5 различных строк
3. Выведи его размер на экран
4. Циклом выведи его содержимое на экран
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
        ArrayList<String> list = new ArrayList<>();  //1
        list.add("1");                               //2
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println(list.size());             //3
        for (int i = 0; i < list.size(); i++) {      //4
            System.out.println(list.get(i));
        }
    }
    
}
