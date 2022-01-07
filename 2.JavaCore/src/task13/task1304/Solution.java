package task1304;

/*
* Создай класс Screen и реализуй в нем интерфесы Selectable и Updatetable
*/

public class Solution {
    public static void main(String[] args) throws Exception{
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatetable {
        void refresh();
    }

    class Screen implements Selectable, Updatetable {
        public void onSelect() {
        }

        public void refresh() {
        }
    }
}
