package task13.task1309;

/*
* 1. Создать интерфейс CanMove с методом speed
* 2. Сделать так, чтобы speed возвращал значение типа Double и ничего не принимал в качестве аргументов
* 3. Создать и унаследовать интерфейс CanFly  от интерфейса CanMove от интерфейса CanMove
* 4. Добавить в интерфейс CanFly метод speed
* 5. Убедиться, что speed возвращает значение типа Double и принимает один параметр типа CanFly
*/

public class Solution {
    public static void main(String[] args) throws Exception{
    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly val);
    }
}
