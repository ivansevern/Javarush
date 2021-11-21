package com.javarush.task1kurs.task03.task0314;
/*
Нужно посчитать сколько литров воды нужно для заполнения бассейна до бортов
Известно, что бассейн имеет размеры a*b*c в метрах
Эти размеры передаюютсяв метод getVolume
Метод должен вернуть кол-во литров которое нужно для наполнения
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c){
        //write this code
        long out = a*b*c*1000;
        return out;
    }
}
