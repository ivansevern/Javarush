package task16.task1630;

/*
* 1. Разберись, что делает программа
* 2. В статическом блоке считай 2 имени файла firstFileName, secondFileName
* 3. Внутри класса Solution создать нить  public static ReadFileThread, которая реализует интерфейс ReadFileInterface
* 3.1 Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое
* 3.2 Метод getFileContent должен возвращать содержимое файла
* 3.3 В методе run считать содержимое файла, закрой поток. Раздели пробелом строки файла
* 4. Подумай в каком месте нужно подождать окончание работы нити, чтобы обеспечить последовательность
* вывод файлов
* 4.1 Для этого добавь вызов соответствующего метода
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {
        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fileName;
        String fileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return null;
        }

        @Override
        public void run() {
            String line;
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                while ((line = br.readLine()) != null) {
                    fileContent += line + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return fileContent;
        }
    }
}
