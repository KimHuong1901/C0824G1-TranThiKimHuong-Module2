package ss3.thuc_hanh;

import java.util.Scanner;

public class SinhVienThiDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int quantityStudent = sc.nextInt();
        if (quantityStudent <= 30 && quantityStudent >= 0) {
            for(int i = 0; i <quantityStudent; i++){
                System.out.print("Enter the grades: ");
                int grade = sc.nextInt();
                if(grade >=0){
                    if (grade >=5 && grade <=10){
                        count++;
                    } else {
                        count = 0;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
