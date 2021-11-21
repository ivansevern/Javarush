package com.javarush.task1kurs.task04.task0406;

/**
 * Допиши код метода  setName
 * чтобы с помощью его установить значение private String fullName
 * равное значению локальной пееменной String fullName
 */
public class Cat {
    private String fullName;

    public void setName(String firstName, String lastMame){
        String fullname = firstName + " " + lastMame;
        //write tis code
        this.fullName = fullName;
    }

    public static void main(String[] args) {

    }
}
