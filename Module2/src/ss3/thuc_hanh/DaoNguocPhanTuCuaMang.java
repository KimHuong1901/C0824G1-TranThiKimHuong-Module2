package ss3.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int data;
        if (size <= 20){
            for (int i = 0; i < size; i++){
                System.out.println("Enter the value: ");
                arr[i] = sc.nextInt();
            }
        for(int i = 0; i < size/2; i++){
            data = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = data;
        }
            System.out.println(Arrays.toString(arr));
        }else {
            System.out.println("The size from 1 to 20");
        }
    }
}
