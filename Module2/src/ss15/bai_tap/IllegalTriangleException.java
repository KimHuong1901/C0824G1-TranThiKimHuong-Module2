package ss15.bai_tap;

import java.io.IOException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the edge of the triangle: ");
        System.out.println("First Edge: ");
        double firstEdge = sc.nextDouble();
        System.out.println("Second Edge: ");
        double secondEdge = sc.nextDouble();
        System.out.println("Third Edge: ");
        double thirdEdge = sc.nextDouble();
        IllegalTriangleException checkTriangle = new IllegalTriangleException();
        checkTriangle.checkTriangle(firstEdge, secondEdge, thirdEdge);
    }
    public void checkTriangle(double firstEdge, double secondEdge, double thirdEdge) {
        try {
            if (firstEdge > 0 || secondEdge > 0 || thirdEdge > 0) {
                double sum1 = firstEdge + secondEdge;
                double sum2 = thirdEdge + secondEdge;
                double sum3 = firstEdge + thirdEdge;
                if (sum1 > thirdEdge && sum2 > firstEdge && sum3 > secondEdge) {
                    System.out.println("This is triangle");
                }else {
                    throw  new Exception("It's not a triangle");
                }
            } else {
                throw  new Exception("It's not a triangle");
            }
        } catch (Exception e) {
            System.err.println ( e.getMessage());
        }
    }
}
