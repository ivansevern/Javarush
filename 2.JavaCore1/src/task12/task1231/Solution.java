package task12.task1231;

/*
* Необходимо расставить правильно ключевые слова abstract, чтобы программа выполнилась
*/

public class Solution {
    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public interface CanFly {
    void fly();
    }

    public static class Horse {
        public void run() {
        }
    }

    public static class Pegasus extends Horse {
    public void fly() {
    }
    }

    public static abstract class SwimmingPegasus extends Pegasus {
    public abstract void swim();
    }
}
