package com.javarush.task1kurs.task07.task0702;
//TODO: создание массива и вывод содержимого
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;

/**
 * 1. Создать массив на 10 строк
 * 2.Ввести с клав 8 строк и сохранить их в массив
 * 3.Вывести содержимое всего массива (10 элем) на экран в обратном порядке
 * каждый сновой строки
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //2 ввод с клавиатуры
        String[] a = new String[10]; //3 создаю массив
        for (int i = 0; i < 8; i++) {  //2 с клав циклом заполняю массив
            a[i] = reader.readLine();
        }
            for (int i = a.length-1; i >= 0; i--) {   //3 циклом вывожу
                System.out.println(a[i]);
            }
        }
    }

