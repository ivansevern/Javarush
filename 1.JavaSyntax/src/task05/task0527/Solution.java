package com.javarush.task1kurs.task05.task0527;
//TODO: создание объектов класса по конструктору
/**
 * Создай классы Dog, Cat, Mouse
 * Добавь по 3 поля в каждый класс, на твой выбор
 * Создай объекты для героев мультика Том и Джери
 * Так много, как только вспомнишь
 */
public class Solution {
    public static void main(String[] args) {
       Mouse jerryMouse = new Mouse("Jerry",12, 5);
       //write this code
       Mouse mouse = new Mouse("Jerry", 3, 2);
       Cat car = new Cat("Tom", 7, 4);
       Dog dog = new Dog("Rax", 8, 2);
    }

    public static class Mouse {
    String name;
    int height;
    int tall;

        public Mouse(String name, int height, int tall) {
            this.name = name;
            this.height = height;
            this.tall = tall;
        }
    }

    //write this code
    public static class Cat {
        String name;
        int height;
        int tall;

        public Cat(String name, int height, int tall) {
            this.name = name;
            this.height = height;
            this.tall = tall;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tall;

        public Dog(String name, int height, int tall) {
            this.name = name;
            this.height = height;
            this.tall = tall;
        }
    }

}
