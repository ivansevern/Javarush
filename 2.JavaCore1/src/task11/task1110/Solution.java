package task11.task1110;

/*
* Добавить недостающие поля
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
    private String name;
    private int age;
    private int weight;
    private int speed;

        public Cat(String name, final int age, final int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public void setWeight(final int weight) {
            this.weight = weight;
        }

        public void setSpeed(final int speed) {
            this.speed = speed;
        }
    }
}
