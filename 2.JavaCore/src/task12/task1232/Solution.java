package task1232;

/*
* Сделать класс Pegasus на основе класса Horse и интерфейса CanFly
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

    public static class Pegasus extends Horse implements CanFly {
    public void fly() {
    }
    }

}
