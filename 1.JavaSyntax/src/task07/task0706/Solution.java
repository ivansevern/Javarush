package com.javarush.task1kurs.task07.task0706;
//TODO: зазделение массива на четные и нечетные числа
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 15 целых чисел
 * 2. Ввести в него значения с клав
 * 3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме
 *    Дома с нечетными номерами расположены на одной стороне улицы, с четными на другой
 *    Выяснить на какой стороне улицы проживает больше жителей
 * 4. Вывести на экран сообщение:
 *    В домах с нечетными номерами проживает больше жителей
 *    или
 *    В домах с четными номерами проживает больше жжителей
 *    дос с порядковым номером 0 считать четным
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countPol =0;
        int countMin = 0;
        int[] a = new int[15];                                //1
        for (int i = 0; i < a.length; i++)                   //2
            a [i] = Integer.parseInt(reader.readLine());
            for (int i = 0; i < a.length ; i++)              //3
               if (i%2==0)                                   //проверяем четные

                countPol+=a[i];
            else
                countMin+=a[i];
           if (countPol>countMin)                            //4
                System.out.println("В домах с четными номерами проживает больше жжителей");
            else
                System.out.println("В домах с нечетными номерами проживает больше жителей");
        }
    }

