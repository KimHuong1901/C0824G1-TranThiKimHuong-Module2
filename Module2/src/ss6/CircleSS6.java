package ss6;

import ss5.Circle;

public class CircleSS6 {
    private double radius;
    private String color;
    public CircleSS6(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public CircleSS6() {
    }

//    public CircleSS6() {
//    }


    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                ", color='" + color;
    }
}
class Cylinder extends CircleSS6{
    private double heigth;
    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }
     public Cylinder(double heigth){
        this.heigth = heigth;
    }
    public double getheigth(){
        return heigth;
    }
    public void setheigth(double heigth) {
        this.heigth = heigth;
    }
    public double getArea(){
        return Math.PI * getRadius() * getRadius();
    }
    public double getVolume(){
        return Math.PI *heigth* getRadius() * getRadius() ;
    }

    @Override
    public String toString() {
        return "Radius is: " + getRadius() + " with color is: " + getColor()+ ", heigth = " + heigth +" with volume is: " + getVolume() + " and area is: " + getArea() ;
    }

    public static void main(String[] args) {
        CircleSS6 circle = new CircleSS6( 5, "blue");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder( 6, "red", 7);
        System.out.println(cylinder);
    }
}

