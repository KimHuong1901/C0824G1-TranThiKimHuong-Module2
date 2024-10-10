package pac1;

import java.util.Arrays;
import java.util.Scanner;

public class ExXoaPhanTu {
    public static void main(String[] args) {
        Scanner index = new Scanner(System.in);

        //nhap so phan tu cua mang
        System.out.println("Enter total index of array: ");
        int indexArray = index.nextInt();

        //khoi tao mang chua cac phan tu nhap vao: arrNum
        int [] arrNum = new int[indexArray];

        //khoi tao mang chua phan tu sau khi xoa: arrNewNum
        int []arrNewNum = new int[indexArray];

        //bat dau nhap cac phan tu cua mang
        for (int i = 0; i < indexArray; i++) {
            Scanner data = new Scanner(System.in);
            System.out.println("Enter array: ");
            arrNum[i] = data.nextInt();
        }

        //in cac phan tu cua mang sau khi nhap
        for (int i = 0; i < indexArray; i++) {
            System.out.print(arrNum[i] + ", ");
        }

        // nhap phantu can xoa trong mang
        Scanner data = new Scanner(System.in);
        System.out.println("Find data: ");
        int datafound = data.nextInt();

        //tim vi tri cua phan tu can xoa trong mang
        int result = Arrays.binarySearch(arrNum, datafound);

        //khai bao so phan tu can them vao mang arrNewNum
        int j = 0;

        //neu ton tai phan tu can xoa
        if (result >= 0){
            for (int i = 0; i < arrNum.length; i++) {
                // duyet qua mang arrNum, neu phan tu hin tai khong phai la phan tu can xoa ( datafound != arrNum[i])
                // thi add phan tu do vao mang arrNewNum
                //sau do tang vij tri duyet cua mang arrNewNum len 1
                if (datafound != arrNum[i]) {
                    arrNewNum[j] = arrNum[i];
                    j++;
                }

            }
        }

        for (int i = 0; i < arrNewNum.length; i++) {
            System.out.println(arrNewNum[i]);
        }
    }
}
