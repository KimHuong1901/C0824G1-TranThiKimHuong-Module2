package ss5;

public class TestCircle {
    private double radius = 1.0;
    private String color = "red";
    public TestCircle(){}
    public TestCircle(double radius) {
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
