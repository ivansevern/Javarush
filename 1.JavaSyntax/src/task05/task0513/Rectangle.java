package com.javarush.task1kurs.task05.task0513;

/**
 * Создать class Rectangle
 * Его данными будут
 * top
 * left
 * width
 * height
 * Создать, как можно больше методов initialize
 */
public class Rectangle {
    //write this code
    public int top, left, width, height;

    public void initialize(int top) {
        this.top = top;
        this.left = 3;
        this.width = 2;
        this.height = 1;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 2;
        this.height = 1;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = 1;
    }

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }


    public static void main(String[] args) {

    }
}
