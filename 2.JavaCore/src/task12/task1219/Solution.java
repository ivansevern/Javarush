package task1219;

/*
 * Есть public интерфейсы CanFly(), CanRun(), CanSwim()
 * Добавь эти интерфейсы классам Human(), Duck(), Penguin(), Airplane(),
 * и не забудь про реализацию методов интерфейсов
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

    public class Human implements CanRun, CanSwim {
        public void run() {
        }

        public void swim() {
        }
    }

    public class Duck implements CanSwim, CanFly, CanRun {
        public void swim() {
        }

        public void fly() {
        }

        public void run() {
        }
    }

    public class Penguin implements CanRun, CanSwim {
        public void run() {
        }

        public void swim() {
        }
    }

    public class Airplane implements CanFly {
        public void fly() {
        }
    }
}
