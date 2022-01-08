package task11.task1106;

/*
* Скрыть все внутренние переменные класса
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, final int age, final int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}
