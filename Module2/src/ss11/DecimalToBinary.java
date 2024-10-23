package ss11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();
        int quotient = decimal / 2;
        int endValue = 0;
        int result = 0;
        if (decimal % 2 != 0) {
            endValue = 1;
        }
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> intArray = new ArrayList<>();
        while (quotient != 0) {
            decimal = quotient;
            quotient = decimal / 2;
            int remainder = decimal % 2;
            intArray.add(remainder);
        }
        intArray.add(0, endValue);
        for (int i = 0; i < intArray.size(); i++) {
            stack.push(intArray.get(i));
        }
        for (int i = 0; i < intArray.size(); i++) {
             intArray.set(i, stack.pop());
            System.out.print(intArray.get(i));
        }
    }
}
