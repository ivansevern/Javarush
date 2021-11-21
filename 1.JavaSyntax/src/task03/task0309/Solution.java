package com.javarush.task1kurs.task03.task0309;
//TODO: вывод произведений чисел от 1 -5 циклом
/**
 * вывести на экан сумму чисел от 1 до 5 построчно
 * должно быть 5 строк
 * 1
 * 1+2=3
 * 1+2+3=6
 * 1+2+3+4=10
 * 1+2+3+4+5=15
 */
public class Solution {
    public static void main(String[] args) {
        //write tis code
        int out =1;
     /*   for (int i = 1; i < 6; i++) {
            out = i*(i+1)/2;
      */
        for (int i = 1; i < 6 ; i++) {  //присваиваю значение циклом к переменной out от 1 -5
         out=i;
            for (int j = 1; j < i; j++) { //присваиваю значение циклом к out от 1 цикла + 2 цикл
               out=j+out;
            }



            System.out.println(out);

        }
         //   System.out.println(out);
        }
    }
