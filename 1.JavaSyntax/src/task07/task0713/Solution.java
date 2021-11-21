package com.javarush.task1kurs.task07.task0713;

/*
1. Ввести с клав 20 чисел, сохрани их в список и рассортируй по 3 другим спискам:
   Число нацело делится на 3 (х%3==0),
         нацело делится на 2
         и все остальные
   Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка
   Порядок объявления списков очень важен
2. Метод printList должен выводить на экран все элементы списка с новой строки
3. Используя метод printList выведи эти три списка на экран. Сначало тот, который для х%3,
   потом тот, который для х%2, потом последний
 */




import java.io.*;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));                 //1
            int a = list.get(i);
            if (a % 3 == 0 && a % 2 == 0) {
                list3.add(a);
                list2.add(a);
            } else if (a % 3 == 0)
                list3.add(a);
            else if (a % 2 == 0)
                list2.add(a);
            else list1.add(a);
        }
        printList(list3);                                                 //3
        printList(list2);
        printList(list1);
    }


    public static void printList(ArrayList<Integer> list) {
        //write this code
        for (int i : list) {                                             //2
            System.out.println(i);
        }
    }
}

