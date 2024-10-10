package pac1;

import java.util.Scanner;

public class ExThemPhanTu {
    public static void main(String[] args) {
        int [] numArr = new int[5];
        int [] newNumArr = new int[numArr.length +1];
        for (int i = 0; i < numArr.length; i++) {
            Scanner data = new Scanner(System.in);
            System.out.println("Enter data: ");
            numArr[i] = data.nextInt();
        }
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter to input data: ");
        int newData = inputData.nextInt();
        Scanner indexData = new Scanner(System.in);
        System.out.println("Enter postion: ");
        int postion = indexData.nextInt();
        int j = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (postion <= -1 && postion >= numArr.length){
                System.out.println("Invalid postion");
                break;
            } else {
                if(postion > i){
                    newNumArr[j] = numArr[i];
                    j++;
                }else if (postion == i){
                    newNumArr[j] = newData;
                    j++;
                } else {
                    newNumArr[j] = numArr[i-1];
                    j++;
                }
            }
        }
        for (int i = 0; i < newNumArr.length; i++) {
            System.out.println(newNumArr[i]);
        }
}
}
