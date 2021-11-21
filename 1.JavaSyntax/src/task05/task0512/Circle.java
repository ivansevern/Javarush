package com.javarush.task1kurs.task05.task0512;

/**
 * Создать class Circle с 3 инициализаторами
 * centerX, centerY, radius
 * centerX, centerY, radius, width
 * centerX, centerY, radius, width, color
 */
public class Circle {
    //write this code
    public int centerX, centerY, radius, width, color;

    public void initialize(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = 5;
        this.color = 1;
    }

    public void initialize(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = 2;
    }

    public void initialize(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}
