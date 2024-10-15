package ss6;

import java.util.Scanner;

public class Triangle {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;
    public Triangle() {}
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPeremiter() {
        return side1 + side2 + side3;
    }
    public double getArea() {
        return side1*side2*side3;
    }

    @Override
    public String toString() {
        return "Triangle with: " + "Peremiter: " + getPeremiter() + ", Area: " + getArea();
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1: ");
        triangle.setSide1(sc.nextDouble());
        System.out.println("Enter the side2: ");
        triangle.setSide2(sc.nextDouble());
        System.out.println("Enter the side3: ");
        triangle.setSide3(sc.nextDouble());
        System.out.println(triangle.toString());
    }
}
