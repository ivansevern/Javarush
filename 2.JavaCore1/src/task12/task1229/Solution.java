package task12.task1229;

/*
* Добавь такой класс-родитель к классу СТО, стобы класс перестал быть абстрактным
*/

public class Solution {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static class Worker {
        public void workHard() {
        }
    }

    public interface Businessman {
        void workHard();
    }

    public static class CTO extends Worker implements Businessman {
    }
}
