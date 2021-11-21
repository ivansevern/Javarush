package com.javarush.task1kurs.task04.task0411;

/**
 * по номеру месяца
 * метод должен определить время года (зима, лето, осень, весна)
 *
 */
public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //wwrite this code
        if (month >= 3 && month <= 5)    // если номер месяца >= 3 или <= 5 то выводим сообщение
            System.out.println("весна");
        else if (month >= 6 && month <= 8) //иначе если
            System.out.println("лето");
        else if (month >= 9 && month <= 11)
            System.out.println("осень");
        else System.out.println("зима"); //иначе остальные варианты
    }
}
