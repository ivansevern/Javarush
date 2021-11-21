package com.javarush.task1kurs.task04.task0421;
//TODO: ввод строк и сравнивание длин
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав 2 имени
 * и если имена  одинаковые вывести сообщение
 * Имена идентичны
 * Если имена разные, но их длины равны вывести
 * Длины имен равны
 * иначе ничего не выводить
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        //write tis code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

       if (name1.equals(name2)) {       //сравниваем имена, если правда вывод сообщения
           System.out.println("Имена идентичны");}


       else if (name1.length() == name2.length()) {  //сравниваем длины имен
           System.out.println("Длины имен равны");
       }
    }
}
