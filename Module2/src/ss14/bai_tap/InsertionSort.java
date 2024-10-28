package ss14.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the array: ");
            int length = sc.nextInt();
            int [] intArray = new int [length];
            for (int i = 0; i < length; i++) {
                System.out.println("Enter the value: ");
                intArray[i] = sc.nextInt();
                System.out.println("Array before insertion: ");
                System.out.println(intArray[i]);
            }
            System.out.println("Arrray after insertion: ");
            insertionSort(intArray);
            for (int i = 0; i < length; i++) {
                System.out.println(intArray[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid value");
        }
    }
    public static void insertionSort(int [] arr) {
        int index;
        int value;
        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            index = i;
            while (index > 0 && value < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = value;
            }
        }
}

