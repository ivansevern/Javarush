package task31.task3108;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
????????? Path
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("C:/test/data/firstDir");
        Path path2 = Paths.get("C:/test/data/secondDir/third");
        Path resultPath = getDiffBetweenTwoPaths(path1, path2);
        System.out.println(resultPath); //excepted output '../secondDir/third' or ' ..\secondDir\third
    }

    public static Path getDiffBetweenTwoPaths(Path path1, Path path2) {
        return path1.relativize(path2);
    }
}
