package task12.task1202;

/*
 * Переопределили метод getName в классе Whale, чтобы программа выдала пустую строку
 */

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я корова";
        }
    }

    public static class Whale extends Cow {
    }
}
