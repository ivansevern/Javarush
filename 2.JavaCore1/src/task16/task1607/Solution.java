package task16.task1607;

/*
* 1. Посчитай кол-во финишированных лошадей и возвратить его. Используя метод isFinished()
* 2. Если лошадь еще не пришла к финишу (!isFinished(), то
* 2.1 Вывести в консоль Waiting for " + horse.getName()
* 2.2 Подождать, пока она завершит гонку.
* 2.3 Не считать такую лошадь финишировавшей
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws InterruptedException{
        List<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        for (Horse horse : horses) {
            if (horse.isFinished()) {
                finishedCount++;
            } else {
                System.out.println("Waiting for " + horse.getName());
                horse.join();
            }
        }
        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        System.out.println("All horses start the race!");
        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }
}

    class Horse extends Thread {
        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return this.isFinished;
        }

        @Override
        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {
                s += "" + 1;
                if (i == 1000) {
                    isFinished = true;
                    s = " has finished the race!";
                    System.out.println(getName() + s);

            }
        }
    }
}
