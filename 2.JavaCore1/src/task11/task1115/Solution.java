package task11.task1115;

/*
* Унаследовать студента от школьника, сотрудника от студента, пенсионера от сотрудника
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Schoolboy {
    }

    public class Student extends Schoolboy {
    }

    public class Worker extends Student {
    }

    public class Retiree extends Worker {
    }
}
