package Bai_tap;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        double exchange = 23000;
        Scanner usd = new Scanner(System.in);
        System.out.println("Enter the usd: ");
        exchange = usd.nextDouble();
        double vnd = exchange * 23000;
        System.out.println("Result is: " + vnd + "VND");
    }
}
