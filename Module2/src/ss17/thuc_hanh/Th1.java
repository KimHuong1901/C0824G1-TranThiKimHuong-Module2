package ss17.thuc_hanh;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Th1 {
    private static void copyFileUsingJava7File(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte [] buffer = new byte[1024];
            int length;
            while((length = is.read(buffer)) > 0){
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String sourcePath = sc.nextLine();
        System.out.println("Enter the destination file: ");
        String destPath = sc.nextLine();
        File source = new File(sourcePath);
        File dest = new File(destPath);
        try{
            copyFileUsingJava7File(source, dest);
            System.out.println("Copy successfully");
        } catch (IOException e) {
            System.out.println("Can't copy file");
            System.out.println(e.getMessage());
        }
    }
}
