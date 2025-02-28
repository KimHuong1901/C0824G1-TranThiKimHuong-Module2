package ss8.mvc.repository;

import ss8.mvc.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    //    wrapper class , <> generic
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1"));
        students.add(new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1"));
        students.add(new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1"));
        File file = new File("src/mvc/data/data.dat");
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Lỗi");
        }
    }

    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
//        File file = new File("src/mvc/data/student.csv");
//        FileReader fileReader  = null;
//        BufferedReader bufferedReader = null;
//        try {
//             fileReader = new FileReader(file);
//             bufferedReader = new BufferedReader(fileReader);
//            String line;
//            String data[];
//            while ((line = bufferedReader.readLine()) != null) {
//                data = line.split(",");
//                students.add(new Student(Integer.parseInt(data[0]), data[1], data[2], Double.parseDouble(data[3]), data[4]));
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Lỗi");
//        } catch (IOException e) {
//            System.out.println("Lỗi");
//        } finally {
//            if (bufferedReader!=null) {
//                try {
//                    bufferedReader.close();
//                } catch (IOException e) {
//                    System.out.println("Lỗi");
//                }
//            }
//            if(fileReader!=null) {
//                try {
//                    fileReader.close();
//                } catch (IOException e) {
//                    System.out.println("Lỗi");
//                }
//            }
//
//
//        }
        File file = new File("src/mvc/data/data.dat");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Lỗi");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;

    }

    public void remove() {
//        students.remove();
    }
}
