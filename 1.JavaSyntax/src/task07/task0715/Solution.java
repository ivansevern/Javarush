package com.javarush.task1kurs.task07.task0715;

import java.util.ArrayList;

/*
1. Создай список слов:
   мама,
   мыла,
   раму
2. После каждого слова вставь в список строку, содержащую слово - именно
3. Вывести результат на экран, каждый элемент списка с новой строки
 */
public class Solution {
    public static void main(String[] args) {
        //wwrite this code
        ArrayList<String> list = new ArrayList<>();
        list.add("Mom");
        list.add("wash");                   //1
        list.add("window");
        list.add(1, "exactly");                  //2
        list.add(3, "exactly");
        list.add(5, "exactly");
        for (String s : list) {                               //2-3
            System.out.println(s);                            //3
        }
    }
}
