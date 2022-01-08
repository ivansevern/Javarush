package task16.task1618;

/*
 * Создай нить TestThread
 * В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt()
 */

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread t = new TestThread();
        t.start();
        t.interrupt();
    }

    public static class TestThread extends Thread {
        public void run() {
        }
    }
}
