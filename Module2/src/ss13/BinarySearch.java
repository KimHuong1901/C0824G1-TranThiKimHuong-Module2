package ss13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the quantity: ");
            int length = sc.nextInt();
            int [] intArray = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Enter value: ");
                intArray[i] = sc.nextInt();
            }
            Arrays.sort(intArray);
            for(int data: intArray){
                System.out.println(data);
            }
            System.out.println("Enter value to find: ");
            int value = sc.nextInt();
            int result = binarySearch(intArray, value, 0, intArray.length - 1);
            System.out.println("Element: " + value + " at index: " + result);

        }catch (InputMismatchException e){
            System.out.println("invalid value");
      }
    }
    public static int binarySearch(int [] array, int value, int left, int right){
        if (left <= right){
            int mid = (right + left)/2;
            if(array[mid] == value){
                return mid;
            }else if(array[mid] < value){
                return binarySearch(array, value, mid, mid *2);
            }else if(array[mid] > value){
                return binarySearch(array, value, left, mid);
            }
        }
        return -1;
    }
}
