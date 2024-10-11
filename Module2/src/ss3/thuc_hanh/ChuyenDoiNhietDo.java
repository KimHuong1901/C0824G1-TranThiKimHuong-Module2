package ss3.thuc_hanh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int choice;
            double fahre;
            double cles;
            do {
                System.out.println("1. F to C");
                System.out.println("2. C to f");
                System.out.println("0. To exit");
                System.out.println("Choose your choices: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the Fahrenheit: ");
                        fahre = sc.nextDouble();
                        System.out.println("Celsius is: " + cles(fahre));
                        break;
                    case 2:
                        System.out.println("Enter the Celsius: ");
                        cles = sc.nextDouble();
                        System.out.println("Fahrenheit is: " + fahre(cles));
                        break;
                    case 0:
                        System.out.println("Goodbye!");
                }
            }while (choice !=0);
        } catch ( InputMismatchException e){
            System.out.println("Please enter a valid choice");
        }
    }
    public static double cles (double fahre){
        double cles = (fahre - 32)* 5/9;
        return cles;
    }
    public static double fahre (double cles){
        double fahre = 1.8 * cles + 32;
        return fahre;
    }
}
