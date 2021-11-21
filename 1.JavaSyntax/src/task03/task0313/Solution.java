package com.javarush.task1kurs.task03.task0313;

import java.util.Random;

/**
 * Вывести на экран все возможные комбинацции слов
 * Мама мыла Раму
 * 6шт
 */
public class Solution {
    public static void main(String[] args) {
        //wwrite this code
        String a = "Мама";
        String b = "Мыла";
        String c = "Раму";

        System.out.println(a+b+c);
        System.out.println(a+c+b);
        System.out.println(b+a+c);
        System.out.println(b+c+a);
        System.out.println(c+a+b);
        System.out.println(c+b+a);
    }
}
