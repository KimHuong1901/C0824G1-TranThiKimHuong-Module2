package ss14.thuc_hanh;

public class SelectionSort {
    static double [] list = {2, 5.4, 6, 7.0, 4, 89};
    public static void main(String[] args) {
        selectionSort();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    public static void selectionSort() {
        for (int i = 0; i < list.length - 1; i++) {
            double min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if(list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

}
