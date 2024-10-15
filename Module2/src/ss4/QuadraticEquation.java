package ss4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getDiscriminant(){
        return  b*b - 4*a*c;
    }
    double getX1(){
        return (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    double getX2(){
        return (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number a: ");
            double a = sc.nextFloat();
            System.out.println("Enter the number b: ");
            double b = sc.nextFloat();
            System.out.println("Enter the number c: ");
            double c = sc.nextFloat();
            QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
            if (a !=0){
                if (quadratic.getDiscriminant() > 0){
                    System.out.println("x1 = " + quadratic.getX1() + ";" + "x2 = " + quadratic.getX2());
                } else if (quadratic.getDiscriminant() == 0){
                    System.out.println("x1 = x2 = " + quadratic.getX1());
                } else if(b == 0 && c ==0){
                    System.out.println("The equation has infinitely many solutions");
                }else {
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
