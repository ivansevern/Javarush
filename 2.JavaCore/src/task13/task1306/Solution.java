package task1306;

/*
 *
 */

public class Solution {
    public static void main(String[] args) throws Exception {
       /* System.out.println(Matrix.NEO);
        System.out.println(Matrix.Trinity);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIDAndName(1, "Neo");
        public static DBObject Trinity = new User().initializeIDAndName(2, "Trinity");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        public User initializeIDAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }*/
    }
}
