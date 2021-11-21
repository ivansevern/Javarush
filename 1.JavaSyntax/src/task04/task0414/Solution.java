package com.javarush.task1kurs.task04.task0414;
//TODO: определение по делению остатка
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клав год
 * определить кол-во дней в году
 * Вывести на экран в виде
 * количество дней в году: x
 * гже х - 366 для високосного года
 * х- 365 для обычного года
 * 1 - если год делится без остатка на 400 это високосный год
 * 2 - в оставшихся годах после этого, если год делится на 100 то это обычный год
 * 3 - в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год
 * 4 - оставшиеся года невисокосные
 * 1700 1800 1900 - не високосные, т.к. они кратны 100 и не кратны 400
 * 1600 2000 - високосные, т.к. кратны 100 и 400
 * 2100 2200 2300 - не високосные
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (x%400 == 0 || x%4 == 0 && x%100 !=0 )
            System.out.println("количество дней в году: " + 366);
        else System.out.println("количество дней в году: " + 365);
    }
}
