package com.javarush.task1kurs.task03.task0320;
//TODO: ввод строк с клав
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Enter for the keyboard and display to screen
 * name зарабатывает $5000. XA
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name+ " зарабатывает $5000. XA");

    }
}
