package ss2.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        String result = "";
        if ( number >= 2){
            for (int i = 0; i < Math.sqrt(number); i++) {
                if (number % i == 0){
                   result = number + "isn't Prime";
                   break;
                } else {
                    result = number + "is Prime";
                }
            }
            System.out.println(result);
        }

    }
}
