package review13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/danacuzmiciov/IdeaProjects/firstProject/src/review13/ArrayUtil.java";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());

        }
    }
}
