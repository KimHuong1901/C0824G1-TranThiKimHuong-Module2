package ss8.mvc.view;

import ss12.bai_tap.controller.ProductController;
import ss12.bai_tap.entity.Product;
import ss8.mvc.controller.StudentController;
import ss8.mvc.entity.Student;

import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Student student = new Student();
        while (true) {
            System.out.println("--------- Quản lý CodeGym ------------");
            System.out.println("1. Quản lý học sinh");
            System.out.println("2. Quản lý giảng viên");
            System.out.println("3. Thoát");
//            System.out.println("Mời bạn nhập lựa chọn");
            int choice = inputPropertyNumberInteger("lựa chọn");
            switch (choice) {
                case 1:
                    menuStudent();
                    break;
                case 2:
                    System.out.println("Quản lý giảng viên");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Bạn nhập không đúng lựa chọn. Vui lòng nhập lại.");
            }
        }

    }

    public static void menuStudent() {
        StudentController studentController = new StudentController();
        Student student = new Student();
        while (true) {
            System.out.println("Menu quản lý học sinh");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Tìm kiếm học sinh theo tên hoặc id");
            System.out.println("6. Sắp xếp học sinh theo tên hoặc id");
            System.out.println("7. Quay lại menu chính");
            Scanner scanner = new Scanner(System.in);
            int choice = inputPropertyNumberInteger("lựa chọn");
            List<Student> students;

            switch (choice) {
                case 1:
                    System.out.println("Hiển thị danh sách học sinh");
                    students = studentController.getAll();
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(students.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Thêm mới học sinh");
                    addNewStudent();
                    studentController.addNewStudent(student);
                    System.out.println(displayListStudent(studentController));

                    break;
                case 3:
                    System.out.println("Sửa thông tin học sinh");

                    break;
                case 4:
                    System.out.println("Xóa học sinh");
                    break;
                case 5:
                    System.out.println("Tìm kiếm học sinh theo tên hoặc id");
                    break;
                case 6:
                    sortStudent(scanner, studentController);
                    break;
                case 7:
                    return;
            }
        }
    }

    public static void sortStudent(Scanner scanner, StudentController studentController) {
        List<Student> students;
        int subChoice;
        System.out.println("Bạn muốn sắp xếp theo:");
        System.out.println("1. Theo tên");
        System.out.println("2. Theo id");
        subChoice = Integer.parseInt(scanner.nextLine());
        if (subChoice == 1) {
            students = studentController.displayAllStudentByName();
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }

        } else if (subChoice == 2) {
            students = studentController.displayAllStudentSortById();
            for (int i = 0; i < students.size(); i++){
                System.out.println(students.get(i));
            }
        } else {
            System.out.println("Invalid");
        }
    }

    public static int inputPropertyNumberInteger(String key){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập " + key + ":");
        int value ;
        while (true) {
            try {
                value = Integer.parseInt(scanner.nextLine());
                if(value < 0) {
                    System.out.print("Số phải là nguyên dương. Mời bạn nhập lại: ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Bạn cần nhập định dạng số: ");
            } catch (Exception e) {
                System.out.println("Lỗi");
            }
        }
        return value;
    }
    public static void addNewStudent(){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id: ");
        student.setCode(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the name: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter the address: ");
        student.setAddress(scanner.nextLine());
        System.out.println("Enter the point: ");
        student.setPoint(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the Class Name: ");
        student.setClassName(scanner.nextLine());
    }
    public static List<Student> displayListStudent(StudentController studentController){
        List<Student> displayStudent = studentController.getAll();
        displayStudent(displayStudent);
        return displayStudent;
    }
    public static void displayStudent(List<Student> student){
        for (Student studentList: student ){
            System.out.println(studentList.toString());
        }
    }
}
