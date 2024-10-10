package ss1.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        try {
            double exchange = 23000;
            Scanner usd = new Scanner(System.in);
            System.out.println("Enter the usd: ");
            exchange = usd.nextDouble();
            if (exchange > 0){
                double vnd = exchange * 23000;
                System.out.println("Result is: " + vnd + "VND");
            } else {
                System.out.println("Incorrect value");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid value");
        }
    }
}
