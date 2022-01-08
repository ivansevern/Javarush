package task16.task1602;

/*
* 1. Создать public static class TestThread, унаследованный от класса Thread
* 2. Создать статик блок внутри TestThread, который выводить в консоль It's a static block u=inside TestThread
* 3. Метод Run должен выводить в консоль It's a run method
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class TestThread extends Thread {
        static {
            System.out.println("It's a static block u=inside TestThread");
        }

        public void run() {
            System.out.println("It's a run method");
        }
    }
}
