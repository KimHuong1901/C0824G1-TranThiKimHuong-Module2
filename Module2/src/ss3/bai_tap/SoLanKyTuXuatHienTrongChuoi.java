package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SoLanKyTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String data = sc.nextLine();
        char[] newArr = data.toCharArray();
        int count = 0;
        System.out.println("Enter the value to find: ");
        char find = sc.next().charAt(0);
        System.out.println(Arrays.toString(newArr));
            for (int i = 0; i < newArr.length; i++) {
                if (find == newArr[i] ) {
                    count++;
                }
            }
        System.out.println(count);
    }
}
