package ss3.bai_tap;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MinTrongMangMotChieu {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        try{
            int index = sc.nextInt();
            int[] numArr = new int[index];
            for (int i = 0; i < index; i++) {
                System.out.println("Enter the value: ");
                numArr[i] = sc.nextInt();
            }
            for (int i = 0; i < index; i++) {
                System.out.println(numArr[i]);
            }
            int min = numArr[0];
            for (int i = 1; i < index; i++) {
                if (min > numArr[i]) {
                    min = numArr[i];
                }
            }
            System.out.println("Min in Arrays is: " + min);
        }catch ( NegativeArraySizeException e){
            System.out.println("Negative array size exception");
        } catch (InputMismatchException e){
            System.out.println("Invalid value");
        }

    }
}
