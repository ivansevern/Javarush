package com.javarush.task1kurs.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
1. Создай список строк
2. Добавь в него 10 строк
3. Узнай, какая строка в списке встретится раньше:
   самаяя короткая или самая длинная. Если несколько,то самая первая
4. Выведи на экран строку строку из п.3
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();                  //1
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());                                   //2
        }
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(list.get(i).length());
        }
        Collections.sort(list1);                                            //3
        int min = list1.get(0);
        int max = list1.get(list1.size() - 1);
        for (int i = 0; i < 10; i++) {                                      //4
            if (list.get(i).length() == min) {
                System.out.println(list.get(i));
                break;
            }
            else if (list.get(i).length() == max){                          //4
                System.out.println(list.get(i));
                break;
            }
        }
    }

}
