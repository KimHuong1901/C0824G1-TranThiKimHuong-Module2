package ss11;

import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {
    public static void main(String[] args) {
        Queue<Character> queueList = new LinkedList<Character>();
        Queue<Character> secondQueueList = new LinkedList<>();
        String myStr = ("HelloplanaLpolleh").toLowerCase();

        String firstMyStr = "";
        String secondMyStr = "";
        for (int i = 0; i < myStr.length()/2; i++){
            queueList.add(myStr.charAt(i));
        }
        for (int i = myStr.length() - 1; i >= myStr.length()/2; i--){
            secondQueueList.add(myStr.charAt(i));
        }
        boolean isPalindrome = true;
        while (!queueList.isEmpty() && !secondQueueList.isEmpty()){
            if(queueList.poll() != secondQueueList.poll()){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Is palidrome");
        }else {
            System.out.println("Isn't palidrome");
        }
}
}
