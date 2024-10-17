package ss7.thuc_hanh.th2;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){}
    public Circle (double radius){
        this.radius = radius;
    }
    public Circle(double raidus, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPremeter(){
        return radius*2 *Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + getRadius() + ", which a supclass of " + super.toString();
    }
}
