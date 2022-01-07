package task1323;

/*
*
*/

public class Solution {
    public static void main(String[] args) throws Exception{
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatetable extends Selectable {
        void refresh();
    }

    class Screen implements Updatetable {
        public void onSelect() {
        }

        public void refresh() {
        }
    }
}
