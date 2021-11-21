package com.javarush.task1kurs.task04.task0420;
//TODO: ввод 3 чисел и вывод по убыванию
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ввести с клав 3 числа и вывести их по убыванию через пробел
 *
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        //write tis code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(reader.readLine());
        int b2 = Integer.parseInt(reader.readLine());
        int c3 = Integer.parseInt(reader.readLine());
//        if (a1 <=b2 && a1 <= c3) {
//            if (b2 <= c3) {
//                System.out.println(c3 + " " + b2 + " " + a1);
//            }
//            else {
//                System.out.println(b2 + " " + c3 + " " + a1);
//            }
//        } else if (b2 <= a1 && b2 <= c3) {
//            if (a1 <= c3) {
//                System.out.println(c3 + " " + a1 + " " + b2);
//            }
//            else {
//                System.out.println(a1 + " " + c3 + " " + b2);
//            }
//        }
//        else {
//            if (a1 <= b2) {
//                System.out.println(b2 + " " + a1 + " " + c3);
//            }
//            else {
//                System.out.println(a1 + " " + b2 + " " + c3);
//            }
//        }
        if (a1<=b2 & b2<=c3) { System.out.println(c3 + " " + b2 + " " + a1);}
        else if (a1<=c3 & c3<=b2) { System.out.println(b2 + " " + c3 + " " + a1);}
        else if (b2<=a1 & a1<=c3) { System.out.println(c3 + " " + a1 + " " + b2);}
        else if (b2<=c3 & c3<=a1) { System.out.println(a1 + " " + c3 + " " + b2);}
        else if (c3<=b2 & b2<=a1) { System.out.println(a1 + " " + b2 + " " + c3);}
        else if (c3<=a1 & a1<=b2) { System.out.println(b2 + " " + a1 + " " + c3);}





    }
}
