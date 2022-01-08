package task13.task1307;

/*
* В классе StringObject реализуй интерфейс SimpleObject  с параметрами типа String
*/

public class Solution {
    public static void main(String[] args) throws Exception{
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}
