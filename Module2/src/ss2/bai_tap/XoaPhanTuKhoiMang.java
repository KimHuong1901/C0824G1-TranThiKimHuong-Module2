package ss2.bai_tap;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {

        try {
            Scanner index = new Scanner(System.in);
            System.out.println("Enter total index of array: ");
            int indexArray = index.nextInt();
            int [] arrNum = new int[indexArray];
            int []arrNewNum = new int[arrNum.length];
                for (int i = 0; i < indexArray; i++) {
                    Scanner data = new Scanner(System.in);
                    System.out.println("Enter array: ");
                    arrNum[i] = data.nextInt();
                }
                for (int i = 0; i < indexArray; i++) {
                    System.out.println(arrNum[i]);
                }
                Scanner data = new Scanner(System.in);
                System.out.println("Find data: ");
                int datafound = data.nextInt();
                int result = Arrays.binarySearch(arrNum, datafound);
                if (result >= 0){
                    int j = 0;
                    for (int i = 0; i < arrNum.length; i++) {
                        if (datafound != arrNum[i]) {
                            arrNewNum[j] = arrNum[i];
                            j++;
                        }
                    }
                    for (int i = 0; i < arrNewNum.length; i++) {
                        System.out.println(arrNewNum[i]);
                    }
            }else {
                    System.out.println("Not found");
            }
        } catch (InputMismatchException e){
            System.out.println("Invalid value");
        } catch (NegativeArraySizeException e){
            System.out.println("Negative array size");
        }
}
}
