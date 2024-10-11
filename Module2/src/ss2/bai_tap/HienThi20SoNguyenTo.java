package ss2.bai_tap;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int numPrime = 2;
        boolean flag = true;
        while (count <=20){
            flag = true;
            for (int i = 2; i <=Math.sqrt(numPrime); i++) {
                if (numPrime%i ==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(numPrime);
                count++;
            }
            numPrime++;
        }
    }
}
