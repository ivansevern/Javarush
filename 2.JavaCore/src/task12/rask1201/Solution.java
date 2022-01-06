package task12.rask1201;

/*
* Переопределили метод getName в классе Whale, чтобы программа выдала:
* Я не корова, Я кит.
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new  Whale();

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
