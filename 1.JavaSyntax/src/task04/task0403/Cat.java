package com.javarush.task1kurs.task04.task0403;
//TODO: присваиваем имя через Set
/**
 * дать имя коту с помощью метода setName
 */
public class Cat{
    private String name = "безымянный кот";

    public void setName(String name){
        //wwrite this code

        this.name = name;

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
