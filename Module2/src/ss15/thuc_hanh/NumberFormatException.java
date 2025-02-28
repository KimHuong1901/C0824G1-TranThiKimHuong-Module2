package ss15.thuc_hanh;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a second number");
        int secondNumber = Integer.parseInt(sc.nextLine());
        NumberFormatException caculate = new NumberFormatException();
        caculate.caculate(firstNumber, secondNumber);
    }
    public void caculate (int x, int y){
        try {
            int addition = x+ y;
            int subtraction = x - y;
            int multiplication = x * y;
            double division = (double) x / y;
            System.out.println("Sum is: " + addition);
            System.out.println("Subtraction is: " + subtraction);
            System.out.println("Multiplication is: " + multiplication);
            System.out.println("Division is: " + division);
        } catch (Exception e) {
                System.err.println("Exception : " + e.getMessage());
        }

    }
}
