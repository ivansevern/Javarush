package task1310;

/*
* Добавь интерфейсы Secretary и Boss к классам Manager, Subordinate
* По одному на каждый.
* Унаследуй интерфейсы Secretary, Boss от интерфейсов Person, HasManagementPotential так,
* чтобы все методы у классов Manager, Subordinate были объявлены в каком-то интерфейсе
*/

public class Solution {
    public static void main(String[] args) {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Person, HasManagementPotential {
    }

    class Manager implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {

        }
    }
}
