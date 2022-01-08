package task13.task1316;

/*
* Удали все некорректные строки в интерфейсе Button
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";
    }

    interface Button extends SimpleObject {
        String Name = "Submit";

        String onPress(Object o);
    }
}
