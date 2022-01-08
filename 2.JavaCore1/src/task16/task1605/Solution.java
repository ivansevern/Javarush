package task16.task1605;

/*
* 1. Измени класс Violin так, чтобы он стал таском для нити. Используй интерфейс MusicianInstrument
* 2. Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
* 2.1 Считай время начала игры - метод startPlaying()
* 2.2 Подожди 1 сек - метод sleepNSeconds(int n), где n - кол-во сек.
* 2.3. Считай время окончания игры - метод stopPlaying()
* 2.4 Выведи на консоль продолжительность игры в милисекундах. Используй методы из п.21, 2.3
*/

import java.util.Date;

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicianInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicianInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        @Override
        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping to play");
            return new Date();
        }

        @Override
        public void run() {
            Date date1 = startPlaying();
            sleepNSeconds(1);
            Date date2 = stopPlaying();
            System.out.println("Playing " + (date2.getTime() - date1.getTime() + " ms"));
        }
    }
}
