package task16.task1604;

/*
* 1.Создать tack (public static class SpecialThread, который реализует интерфейс Runnable
* 2. SpecialThread должен выводить в консоль свой стек-трейс
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element: Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
