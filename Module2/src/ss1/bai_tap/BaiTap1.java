package ss1.bai_tap;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String nameEnter = name.nextLine();
        System.out.println("Hello: " + nameEnter);
    }
}
