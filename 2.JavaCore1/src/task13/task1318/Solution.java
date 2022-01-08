package task13.task1318;

/*
 * 1. Считать с консоли путь к файлу
 * 2. Вывести в консоли содержимое файла
 * 3. Освободить ресурсы. Закрыть поток чтения файла и поток ввода с клавиатуры
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        System.out.println(builder.toString());
        scanner.close();
        reader.close();
    }
}
