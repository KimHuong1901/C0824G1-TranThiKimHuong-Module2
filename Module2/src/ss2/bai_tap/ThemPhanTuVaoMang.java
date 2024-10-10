package ss2.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        try {
            int [] numArr = new int[5];
            int [] newNumArr = new int[numArr.length +1];
            Scanner data = new Scanner(System.in);
            for (int i = 0; i < numArr.length; i++) {
                System.out.println("Enter data: ");
                numArr[i] = data.nextInt();
            }
            System.out.println("Enter to input data: ");
            int newData = data.nextInt();
            System.out.println("Enter postion: ");
            int postion = data.nextInt();
            if (postion <= -1 || postion >= numArr.length){
                System.out.println("Invalid postion");
            } else {
                int j = 0;
                for (int i = 0; i < numArr.length; i++) {
                    if(postion > i) {
                        newNumArr[j] = numArr[i];
                        j++;
                    } else if (postion == i) {
                        newNumArr[j] = newData;
                        j++;
                        i--;
                        postion = -1;
                    } else {
                        newNumArr[j] = numArr[i];
                        j++;
                    }
                }
            }
            for (int i = 0; i < newNumArr.length; i++) {
                System.out.print(newNumArr[i] + ",");
            }
        }catch (Exception e){
            System.out.println("Invalid value");
        }
    }
}
