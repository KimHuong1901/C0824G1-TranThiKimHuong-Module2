package ss14.thuc_hanh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoTaNoiBot {
    public static void main(String[] args) {
        int[] intArray = null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the quantity: ");
            int quantity = sc.nextInt();
            intArray = new int[quantity];
            for (int i = 0; i < quantity; i++) {
                System.out.println("Enter the value: ");
                int value = sc.nextInt();
                intArray[i] = value;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid value");
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println("Array sorted: ");
        bubbleSort(intArray);
    }
    public static void bubbleSort(int [] intArray){
        boolean flag = false;
        for (int x = 1; x < intArray.length && flag; x++){
            for (int i = 0; i < intArray.length - x; i++) {
                if (intArray[i] > intArray[i+1]){
                    int temp = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                System.out.println("Array may be sorted");
                break;
            }
            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            }
            System.out.println();
        }
    }
}
