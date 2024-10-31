package ss17.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Lạc", "13HN"));
        students.add(new Student(2, "Bình", "14HN"));
        students.add(new Student(3, "Nguyên", "15HN"));
        students.add(new Student(4, "An", "16HN"));
        writeDataToFile("students.txt", students);
        List<Student> students2 = readDataFromFile("students.txt");
        for (Student student : students2) {
            System.out.println(student);
        }
    }
    public static void writeDataToFile(String path, List<Student> students){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
