package ss3.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TongGiaTriMotCotMangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter row of the array: ");
            int row = sc.nextInt();
            System.out.println("Enter column of the array: ");
            int column = sc.nextInt();
            if (row > 0 && column >0){
                float [][] primeArr = new float[row][column];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.println("Enter the number: ");
                        primeArr[i][j] = sc.nextFloat();
                    }
                }
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(primeArr[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Enter the column to caculate: ");
                int indexcolumn = sc.nextInt();
                float sum = 0;
                if (indexcolumn >=0 && indexcolumn < column){
                    for (int i = 0; i < row; i++) {
//                    for (int j = indexcolumn;;){
                        sum += primeArr[i][indexcolumn];
//                    }
                    }
                    System.out.println("Sum in " + indexcolumn + " columns: " + sum);
                } else {
                    System.out.println("Invalid value");
                }
            } else {
                System.out.println("Invalid value");
            }
        }catch (InputMismatchException e){
            System.out.println("Enter invalid value");
        }
    }
}
