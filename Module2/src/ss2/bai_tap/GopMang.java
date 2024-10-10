package ss2.bai_tap;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        try {
            int [] numArr1 = new int [5];
            int [] numArr2 = new int [7];
            int [] numArr3 = new int [numArr1.length + numArr2.length];
            int k = 0;
            for (int i = 0; i < numArr1.length; i++) {
                Scanner data =  new Scanner(System.in);
                System.out.println("Enter number");
                numArr1[i] = data.nextInt();
            }
            for (int j = 0; j < numArr2.length; j++) {
                Scanner data =  new Scanner(System.in);
                System.out.println("Enter number");
                numArr2[j] = data.nextInt();
            }
            for (int i = 0; i < numArr1.length; i++) {
                numArr3[k] = numArr1[i];
                k++;
            }
            for (int j = 0; j < numArr2.length; j++) {
                numArr3[k] = numArr2[j];
                k++;
            }
            System.out.println(Arrays.toString(numArr3));
        } catch (InputMismatchException e){
            System.out.println("Invalid value");
        }
    }
}
