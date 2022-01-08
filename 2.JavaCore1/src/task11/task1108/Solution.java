package task11.task1108;

/*
* Скрой все внутренние переменные класса Сат, а также методы,
* позволяющие менять внутреннее состояние объектов класса Сат
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
    public String name;
    public int age;
    public int weight;

        public Cat(final String name, final int age, final int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return this.name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(final int age) {
            this.age = age;
        }
    }

}
