package task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
Используем RandomAccessFile
*/
public class Solution {
    public static void main(String... args) {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            long number = Long.parseLong(args[1]);
            String text = args[2];
            long fileLength = raf.length();

            raf.seek(number);
            byte[] readBytes = new byte[text.length()];
            raf.read(readBytes, 0, text.length());

            String readstring = new String(readBytes);

            raf.seek(fileLength);
            if (readstring.equals(text)) {
                raf.write("true".getBytes());
            } else {
                raf.write("false".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
