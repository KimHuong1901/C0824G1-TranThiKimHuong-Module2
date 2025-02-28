package ss15.thuc_hanh;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.intArr();
        System.out.println("Enter the index to find: ");
            int index = Integer.parseInt(sc.nextLine());
            try {
                System.out.println("At index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }
    public Integer [] intArr (){
        Scanner sc = new Scanner(System.in);
        Integer [] intArr = new Integer[100];
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Enter the value: ");
            intArr[i] = Integer.parseInt(sc.nextLine());
        }
        return intArr;
    }
}
