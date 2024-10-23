package ss11;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intArrayStack(intStack);
        Stack<String> stringStack = new Stack<>();
        stringsStack(stringStack);
    }
    public static void intArrayStack(Stack<Integer> stack) {
        int [] intArray = {1,2,3,4};
        for (int i = 0; i < intArray.length; i++) {
            stack.push(intArray[i]);
        }
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = stack.pop();
            System.out.println(i + " : " + intArray[i]);
        }
    }
    public static void stringsStack(Stack<String> stack) {
        String string = "Ngăn xếp là 1 dạng đặc biệt của danh sách liên kết";
        String [] stringArray = string.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            stack.push(stringArray[i]);
        }
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stack.pop();
            System.out.println(i + " : " + stringArray[i]);
        }
    }
}
