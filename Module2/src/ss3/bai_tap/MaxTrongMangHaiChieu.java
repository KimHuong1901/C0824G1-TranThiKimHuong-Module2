package ss3.bai_tap;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of the array: ");
        try {
            int indexRow = sc.nextInt();
            System.out.println("Enter column of the array: ");
            int indexColumn = sc.nextInt();
            if (indexRow > 0){
                if(indexColumn > 0){
                    float [][] numArr = new float[indexRow][indexColumn];
                    for(int i = 0; i < indexRow; i++){
                        for(int j = 0; j < indexColumn; j++){
                            System.out.println("Enter number: ");
                            numArr[i][j] = sc.nextFloat();
                        }
                    }
                    float max = numArr[0][0];
                    for(int i = 0; i < indexRow; i++){
                        for(int j = 0; j < indexColumn; j++){
                            if (max < numArr[i][j]){
                                max = numArr[i][j];
                            }
                        }
                    }
                    System.out.println("Max in Arrays is: " + max);
                }else {
                    System.out.println("Invalid value. It's must be greater than zero.");
                }
            } else {
                System.out.println("Invalid value. It's must be greater than zero.");
            }
        } catch ( InputMismatchException e){
            System.out.println("Invalid value.");
        }
    }
}
