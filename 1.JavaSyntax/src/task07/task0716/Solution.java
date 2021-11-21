package com.javarush.task1kurs.task07.task0716;

/*
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
   2.1 удалять из списка строк все слова, содержащие букву "р"
   2.2 удваивать все слова содержащие букву "л"
   2.3 если слово содержит и букву "р" и букву "л", то оставить это слово без изменений
   2.4 с другими словами ничего не делать
   Пример: роза лира лоза
   вывод:  лира лоза лоза
 */
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static ArrayList<String>fix(ArrayList<String>strings) {
        //write this code
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("р") && !strings.get(i).contains("л")) {        // проверяем слова на буквы
                strings.remove(strings.get(i));                                          // л и р если нет
                i--;                                                                     // удаляем слово из списка
            }
            else if (strings.get(i).contains("л") && !strings.get(i).contains("р")) {    //удваиваем слово если
                strings.add(i+1, strings.get(i));                                  //буква л есть
                i++;
            }
        }
        return strings;
    }
}
