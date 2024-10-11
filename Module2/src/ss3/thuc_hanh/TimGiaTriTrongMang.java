package ss3.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total student");
        int size = sc.nextInt();
        if (size > 0) {
            String [] studentList = new String[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Please enter student name: ");
                studentList[i] = sc.nextLine();
            }
            System.out.println("Enter the student name to find");
            String findName = sc.nextLine();
            int index;
            boolean result = false;
            for (int i = 0; i < size; i++) {
                if (findName.equals(studentList[i])) {
                    index = i+1;
                    result = true;
                    System.out.println("Student with name is: " + findName + " at postion: " + index + " in the List" );
                    break;
                }
            }
            if (!result){
                System.out.println("Not found this name");
            }
        }
    }
}
