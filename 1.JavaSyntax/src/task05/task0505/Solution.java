package com.javarush.task1kurs.task05.task0505;

/**
 * Создать 3 кота используя класс Сat
 * Провести 3 боя попарно между котами
 * Класс Сat создавать не надо.
 * Для боя использовать метод boolean fight(Cat anotherCat)
 * Результаты каждого боя вывести на экран с новойй строки
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
        Cat cat1 = new Cat("cat1", 3, 3, 1);  //создаю кота по шаблону с параметрами
        Cat cat2 = new Cat("cat2", 4, 4, 3);
        Cat cat3 = new Cat("cat3", 5, 2, 4);

        System.out.println(cat1.fight(cat2));                          //1 бой кота1 с котом2
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strenght;


        public Cat(String name, int age, int weight, int strenght) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strenght = strenght;
        }

        public boolean fight(Cat anotherCat) {
            int ageCount = Integer.compare(this.age, anotherCat.age);
            int weightCount = Integer.compare(this.weight, anotherCat.weight);
            int strenghtCount = Integer.compare(this.strenght, anotherCat.strenght);

            int count = ageCount + weightCount + strenghtCount;
            return  count >0;  //return score >0 ? true : false;
        }
    }

}
