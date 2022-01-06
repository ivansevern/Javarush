package task1228;

/*
* Добавить как можно больше интерфейсов к классу Human, но так, чтобы он не стал абстрактным классом
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Worker {
        void workLazy();
    }

    public interface Businessman {
        void workHard();
    }

    public interface Secretary {
        void workLazy();
    }

    public interface Miner {
        void workVeryHard();
    }

    public static class Human implements Businessman {
    public void workHard() {
    }

    public void workLazy() {
    }
    }

}
