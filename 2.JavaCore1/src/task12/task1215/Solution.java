package task12.task1215;

/*
* Унаследуй классы. Реализуй недостающие методы.
* Классы Cat, Dog не должгы быть абстрактными
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
    public String getName() {
        return "Кот";
    }

    public Pet getChild() {
        return new Cat();
    }
    }

    public static class Dog extends Pet {
        public String getName() {
            return "Собака";
        }

        public Pet getChild() {
            return new Dog();
        }
    }
}