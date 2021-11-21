package com.javarush.task1kurs.task06.task0621;
/*
Create a class that described this situation. Create 2 objects: a cat-daughter and cat-mother. Take them on the screen.
New task: each cat has a name, cat dad and cat-mom. Change Cat class so that it can describe this situation.
Create 6 objects: grandfather (daddy dad), grandmother (mother's mom), dad, mother, son, daughter. To bring them all
on the screen in order: grandfather, grandmother, dad, mom, son, daughter.
Input Example:
Grandpa Vasya
Grandma Murka
Pope Kotofee
Mom Vasilisa
Son Murchik
Daughter Puffcint
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName);

        String baName = reader.readLine();
        Cat catBa = new Cat(baName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catDad);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catBa, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catDad);
        System.out.println(catBa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }
    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }
        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }
        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father ";
            if (mother != null && father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            if (mother == null)
                return "The cat's name is " + name + ", no mother" + " father is  " + father.name;
            else
                return " The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}
