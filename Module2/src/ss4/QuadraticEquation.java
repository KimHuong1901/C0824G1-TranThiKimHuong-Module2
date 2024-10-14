package ss4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquation {
    float a;
    float b;
    float c;
    double getDiscriminant(float a, float b, float c){
        return  b*b - 4*a*c;
    }
    double getX1(float a, float b, float c){
        return (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    double getX2(float a, float b, float c){
        return (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    public static void main(String[] args) {
        QuadraticEquation quadratic = new QuadraticEquation();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number a: ");
            float a = sc.nextFloat();
            System.out.println("Enter the number b: ");
            float b = sc.nextFloat();
            System.out.println("Enter the number c: ");
            float c = sc.nextFloat();
            if (a !=0){
                if (quadratic.getDiscriminant(a, b, c) > 0){
                    System.out.println("x1 = " + quadratic.getX1(a, b, c) + ";" + "x2 = " + quadratic.getX2(a, b, c));
                } else if (quadratic.getDiscriminant(a, b, c) == 0){
                    System.out.println("x1 = x2 = " + quadratic.getX1(a, b, c));
                } else {
                    System.out.println("The equation has no roots");
                }
            } else {
                System.out.println("Is not QuadraticEquation");
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid value");
        }
    }
}
