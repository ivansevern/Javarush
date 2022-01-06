package task1214;

/*
* Унаследуй класс Cow of Animal
* Реализуй все недостающие методы в классе Cow
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static abstract class Animal {
    public abstract String getName();
    }

    public static class Cow extends Animal {
    public String getName() {
        return "Корова";
    }
    }


}
