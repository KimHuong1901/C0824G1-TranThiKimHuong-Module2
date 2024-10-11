package ss2.bai_tap;

public class TatCaSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int numPrime = 2;
        boolean flag = true;
        for (; numPrime < 100; numPrime++) {
            flag = true;
            for (int i = 2; i <= Math.sqrt(numPrime); i++) {
                if (numPrime % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(numPrime);
            }
        }
        }
    }

