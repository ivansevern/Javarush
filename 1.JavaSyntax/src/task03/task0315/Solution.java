package com.javarush.task1kurs.task03.task0315;

/**
 * Create 7 objects, that display to screen
 * 7 colors of the rainbow
 */
public class Solution {
    public static void main(String[] args) {
        //write this code
        Red red = new Red();
        Orange orange = new Orange();

    }

    public static class  Red{
        public Red(){
            System.out.println("Red");
        }
    }

    public static class Orange{
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow{
        public Yellow(){
            System.out.println("Yellow");
        }
    }

    public static class Green{
        public Green(){
            System.out.println("Green");
        }
    }

    public static class Blue{
        public Blue(){
            System.out.println("Blue");
        }
    }

    public static class Indigo{
        public Indigo(){
            System.out.println("Indigo");
        }
    }

    public static class Violet{
        public Violet(){
            System.out.println("Violet");
        }
    }
}
