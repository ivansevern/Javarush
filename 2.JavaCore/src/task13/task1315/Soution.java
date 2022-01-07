package task1315;

/*
* Создай классы Dog, Cat, Mouse
* Реализуй интерфейсы в добавленных классах
* Кот - может передвигатьсяб кого-то съесть и может быть съеден сам
* Мышь - может передвигаться и ее могут съесть
* Собака - может передвигаться и съесть кого-то
*/

public class Soution {
    public static void main(String[] args) {
    }

    public interface Movable {
        void move();
    }

    public interface Edible {
        void beEaten();
    }

    public interface Eat {
        void eat();
    }

    class Cat implements Movable, Edible, Eat {

        public void eat() {
        }

        public void beEaten() {
        }

        public void move() {
        }
    }

    class Mouse implements Movable, Edible {
        public void beEaten() {
        }

        public void move() {
        }
    }

    class Dog implements Movable, Eat {
        public void eat() {
        }

        public void move() {
        }
    }
}
