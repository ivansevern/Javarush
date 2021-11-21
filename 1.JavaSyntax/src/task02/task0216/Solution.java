package com.javarush.task1kurs.task02.task0216;
//TODO: минимум из 3 чисел
/**
 * write function min of 3 numbers
 */
public class Solution {
    public static int min(int a, int b, int c){
        //write this code
    /*    int m=a;
        if (b<m)  m=b;
        if (c<m) m=c;
        return m; */
     /*   if (a<=b && a<=c){
            return a;}
       else if (c<=b && a>=c){
            return c;}
       else {
        return b;} */
        if (a<=b && a<=c)
            return a;
       if (c<=b && a>=c)
            return c;
        else
            return b;

    }

    public static void main(String[] args) {
        System.out.println(min(1, 1, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 2, 10));
    }
}
