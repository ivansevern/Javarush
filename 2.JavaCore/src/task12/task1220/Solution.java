package task1220;

/*
* Напиши public класс Human(), и public интерфейсы CanRun(), CanSwim()
* Добавь в каждый интерфейс по 1 методу
* Добавь эти интерфейсы классу Human, но не реализуй методы
* Объяви класс Human абстрактным
*/

public class Solution {
    public static void main(String[] args) {
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public abstract class Human implements CanRun, CanSwim {
    }
}
