package com.javarush.task1kurs.task05.task0526;

/**
 * Внутри класса Solution создай public static Man и Woman
 * У классов должны быть поля:
 * name String, age int, address String
 * Создай конструкторы, в которые передаются все возможные параметры
 * Создай по 2 объекта каждого класса со всеми данными используя конструктор
 * Объекты выведи на экран в таком формате
 * name + "" + age + "" + asdress
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
        Man man1 = new Man("Ivan", 37, "Kaluga");
        Man man2 = new Man("Ivan", 38, "New-York");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        Woman woman1 = new Woman("1", 22, "22");
        Woman woman2 = new Woman("2", 23, "44");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

    }
    //write this code
    public static class Man{
        String name;
        int age;
        String address;


        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;


        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}
