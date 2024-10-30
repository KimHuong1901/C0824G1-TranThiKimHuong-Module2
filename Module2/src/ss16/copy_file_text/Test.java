package ss16.copy_file_text;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Source file name:  ");
        String sourceFile = "src/ss16/copy_file_text/" + scanner.nextLine() + ".csv";
        System.out.print("Target file name: ");
        String targetFile = scanner.nextLine();
        copyFileText.getCountries(sourceFile, targetFile);
        scanner.close();
    }
}
