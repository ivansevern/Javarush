package com.javarush.task1kurs.task04.task0410;
/*TODO: написать метод checkInterval
метод дожен проверять опало ли ццелое число в интервал от 50 до 100 и вывести на экран
"Число number не содержится в интервале"
"Число number содержится в интервале"

 */
public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int number) {
        //write this code
        if (number >= 50 && number <= 100)
            System.out.println("Число " + number + " содержится в интервале");
        else System.out.println("Число " + number + " не содержится в интервале");
    }
}
