package ss16.copy_file_text;

import ss16.read_file.Country;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    private int id;
    private String code;
    private String name;
    public CopyFileText() {}
    public CopyFileText(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
    public void getCountries(String sourceFile, String targetFile) {
        File source = new File(sourceFile);
        File target = new File(targetFile);
        if (!source.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }
        if (target.exists()) {
            System.out.println("Target file already exist.");
            return;
        }
        try (FileInputStream inputStream = new FileInputStream(source);
             FileOutputStream outputStream = new FileOutputStream(target)) {
            int byteRead;
            int totalBytes = 0;
            int characterCount = 0;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
                totalBytes++;
            }

            System.out.println("Coppy successfully " + totalBytes + " byte from: " + sourceFile + " to: " + targetFile);
            System.out.println("Number charactor in Source file:  " + characterCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    }