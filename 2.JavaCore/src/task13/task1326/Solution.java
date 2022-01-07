package task1326;

/*
* 1. Ввести имя файла с консоли
* 2. Прочитать из него набор чисел
* 3. Вывести в консоли только четные, отсортированные по возврастанию
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        Scanner scanner = new Scanner(new FileInputStream(sourceFileName));

        List<Integer> data = new ArrayList<>();
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) data.add(value);
        }

        Collections.sort(data);
        for (Integer value : data) {
            System.out.println(value);
        }
        scanner.close();
    }
}
