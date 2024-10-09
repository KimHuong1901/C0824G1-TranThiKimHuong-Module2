import java.util.Scanner;

public class bai_tap_1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String nameEnter = name.nextLine();
        System.out.println("Hello: " + nameEnter);
    }
}
