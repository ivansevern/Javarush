package task1227;

/*
* Есть интерфейсы CanFly, CanSwim, CanRun
* Добавь эти интерфейсы классам Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public class Penguin implements CanSwim, CanRun {
    public void swim() {
    }

    public void run() {
    }
    }

    public class Toad implements CanSwim {
    public void swim() {
    }
    }


}
