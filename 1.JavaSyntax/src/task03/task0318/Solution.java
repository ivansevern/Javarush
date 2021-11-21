package com.javarush.task1kurs.task03.task0318;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ввести с клав число и имя
 * вывести на экран
 * "имя" захватит ми через "число" лет. Му-ха-ха
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

System.out.println(name + " захватит мир через " + n + "лет. Му-ха-ха");



    }
}
