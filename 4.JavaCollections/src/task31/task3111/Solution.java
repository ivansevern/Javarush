package task31.task3111;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
����������� ����� ������
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor();

        searchFileVisitor.setPartOfName("amigo");
        searchFileVisitor.setPartOfContent("programmer");
        searchFileVisitor.setMinSize(500);
        searchFileVisitor.setMaxSize(10000);

        Files.walkFileTree(Paths.get("C:/SecretFolder"), searchFileVisitor);

        List<Path> foundsFiles = searchFileVisitor.getFoundFiles();
        for (Path file : foundsFiles) {
            System.out.println(file);
        }
    }
}