package ss5;

public class Circle {
    private double radius;
    private String color;
    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

    }
}
