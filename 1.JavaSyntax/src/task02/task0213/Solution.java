package com.javarush.task1kurs.task02.task0213;

/**
 * Create object type of Cat,
 * object type of Dog,
 * object type of Fish,
 * object type of Woman
 * and give each animals an owner
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
       Cat cat = new Cat(); //create object
       cat.owner = new Woman(); //gave an owner

       Dog dog = new Dog();
       dog.owner =  new Woman();


       Fish fish = new Fish();
       fish.owner = new Woman();

       Woman woman = new Woman();
    }

    public static class Cat{
        public Woman owner;
    }

    public static class Dog{
        public Woman owner;
    }

    public static class Fish{
        public Woman owner;
    }

    public static class Woman{
    }
}
