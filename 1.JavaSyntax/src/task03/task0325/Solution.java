package com.javarush.task1kurs.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        //writethis code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Я буду зарабатывать $"+n+" в час");
    }
}
