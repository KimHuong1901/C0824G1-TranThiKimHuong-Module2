package ss15.bai_tap;

import java.util.Scanner;

public class Traingle extends IllegalTraingle {
    public Traingle(double firstEdge, double secondEdge, double thirdEdge) {
        super(firstEdge, secondEdge, thirdEdge);
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the edge of the triangle: ");
            System.out.println("First Edge: ");
            double firstEdge = sc.nextDouble();
            System.out.println("Second Edge: ");
            double secondEdge = sc.nextDouble();
            System.out.println("Third Edge: ");
            double thirdEdge = sc.nextDouble();
            Traingle traingle = new Traingle(firstEdge, secondEdge, thirdEdge);
            System.out.println("This is traingle ");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
