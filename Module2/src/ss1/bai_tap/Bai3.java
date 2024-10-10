package ss1.bai_tap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = num.nextInt();
        String result = "";
        if ( number >= 0 && number <= 10) {
            String numstr = String.valueOf(number);
            if ("0".equals(numstr) ){
                result = "Zero";
            } else {
                result = callhundred(numstr);
            }
            System.out.println(result);
        } else if (number < 20){
            switch (number){
                case 11:
                    result = "Eleven";
                    break;
                case 12:
                    result = "Twelve";
                    break;
            }
            if (number != 11 || number != 12){
                String numstr = String.valueOf(number);
                String[] arrNum = numstr.split("");
                String result1 = call(arrNum[1]) + "teen";
                System.out.println(result1);
            }
         }  else if (number < 100){
            String numstr = String.valueOf(number);
            String[] arrNum = numstr.split("");
            String result1 = "";
            String result2 = "";
                 result1 = call (arrNum[0]);
                if (arrNum[1] == "0"){
                    result2 = "";
                } else {
                    result2 = callhundred (arrNum[1]);
                }
            System.out.println(result1 + " " + result2);
            } else {
                String numstr = String.valueOf(number);
                String[] arrNum = numstr.split("");
                String result1 = "";
                String result2 = "";
                String result3 = "";
                    result1 = callhundred (arrNum[0]);
                if( arrNum[1] == "0"){
                    result2 = "";
                }else {
                    result2 = call (arrNum[1]);
                }
                if( arrNum[2] == "0"){
                    result3 = "";
                }else {
                    result3 =  callhundred (arrNum[2]);;
                }
            System.out.println(result1+ "hundred and " + " " + result2 + " " + result3);
        }

}
public static String call (String data){
        String result = "";
    switch (data){
        case "1":
            result = "One";
            break;
        case "2":
            result = "Twen";
            break;
        case "3":
            result = "Third";
            break;
        case "4":
            result = "Four";
            break;
        case "5":
            result = "Fif";
            break;
        case "6":
            result = "Six";
            break;
        case "7":
            result = "Seven";
            break;
        case "8":
            result = "Eight";
            break;
        case "9":
            result = "Nice";
            break;
        case "10":
            result = "Ten";
            break;
}
return result + "ty";
}
public static String callhundred (String data){
        String result = "";
    switch (data){
        case "1":
            result = "One";
            break;
        case "2":
            result = "Two";
            break;
        case "3":
            result = "Three";
            break;
        case "4":
            result = "Four";
            break;
        case "5":
            result = "Five";
            break;
        case "6":
            result = "Six";
            break;
        case "7":
            result = "Seven";
            break;
        case "8":
            result = "Eight";
            break;
        case "9":
            result = "Nice";
            break;
        case "10":
            result = "Ten";
            break;
    }
    return result;
}
}

