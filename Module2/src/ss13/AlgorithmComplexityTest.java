package ss13;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");
        String dataString = sc.nextLine();
        int [] charArray = new int[255];
        for (int i = 0; i < dataString.length(); i++) {
            int ascii = dataString.charAt(i);
            charArray[ascii]+=1;
        }
        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if(charArray[i] > max) {
                max = charArray[i];
                character = (char) i;
            }
        }
        System.out.println(character + " with a frequency of " + max + "times");
    }
}
