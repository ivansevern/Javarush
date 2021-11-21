package com.javarush.task1kurs.task05.task0520;

/**
 * создать class Rectangle
 * Его данные будут
 * top
 * left
 * width
 * height
 * Создать побольше методов конструкторов
 *
 * Пример
 * 1 заданы все 4 параметра
 * 2 ширина и высота не заданы(оба равны 0)
 * 3 высота не задана (равна ширине) создаем квадрат
 * 4 создаем копию другого прямоугодьника (он и передается в параметрах)
 */
public class Rectangle {
    //write this code
    public int top, left, width, height;


    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        height=width;
    }

    public Rectangle(Rectangle rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
