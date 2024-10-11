package ss3.bai_tap;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TongHaiDuongCheo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the arrays: ");
            int row = sc.nextInt();
            int column = row;
            if(row >0){
                float [][] numArr = new float[row][column];
                for(int i = 0 ; i < row ; i++){
                    for(int j = 0; j < column ; j++){
                        System.out.println("Enter the value: ");
                        numArr[i][j] = sc.nextFloat();
                    }
                }
                for(int i = 0 ; i < row ; i++){
                    for (int j = 0 ; j < column ; j++){
                        System.out.print(numArr[i][j] + " ");
                    }
                    System.out.println();
                }
                int sum1 =0;
                for(int i = 0 ; i < row ; i++){
                    sum1 += numArr[i][i];
                }
                int sum2 =0;
                int j = column-1;
                for(int i = 0 ; i < row ; i++){
                    sum2 += numArr[i][j];
                    j--;
                }
                int result = sum1+sum2;
                System.out.println(result);
            } else {
                System.out.println("Incorrect value");
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid value");
        }

        }
    }
