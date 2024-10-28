package ss14.thuc_hanh;

public class NoiBot {

    public static void main(String[] args) {
        int [] intArray = {2, 3, 5, 5, 4, 22, 6, 8, 2};
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
            System.out.println(intArray[i]);
        }
    }
}
