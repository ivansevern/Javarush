package task16.task1612;

/*
* 1. Разберись, что делает программа
* 2. Реализуй логику метода doStep так, чтобы учитывалась скорость бегуна
* 2.1 Метод getSpeed() в классе Runner показывает, сколько шагов в секунду делает бегун
* Нужно, чтобы бегун действительно делал заданное количество шагов в секунду
* Если Иванов делает 4 шага в секунду, то за 2 сек он сделает 8 шагов
* Если Петров делает 2 шага в сек, то за 2 сек он сделает 4 шага
* 2.2 Метод sleep в классе Thread принимает параметр типа long
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException{

    }

    public static class Stopwatch extends Thread {
        private Runner owner;
        private int stepNumber;

        public Stopwatch(Runner runner) {
            this.owner = runner;
        }

        public void run() {
            try {
                while (!isStopped) {
                    doStep();
                }
            } catch (InterruptedException e) {
            }
        }

        private void doStep() throws InterruptedException {
            stepNumber++;
            //
            Thread.sleep(1000 / owner.getSpeed());
            System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!");
        }
    }

    public static class Runner {
        Stopwatch stopwatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
            this.stopwatch = new Stopwatch(this);
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start();
        }
    }
}
