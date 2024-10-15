package ss5;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }
    protected double getRadius() {
        return radius;
    }
    protected double getArea() {
        return Math.PI * radius * radius;
    }
}
class TestCircle{
    public static void main(String[] args) {
       Circle test = new Circle();
        test.getArea();
        test.getRadius();
        System.out.println("Area is " + test.getArea() + " and radius is " + test.getRadius());
    }
}


