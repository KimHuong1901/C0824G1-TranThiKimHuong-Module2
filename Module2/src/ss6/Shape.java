package ss6;

import java.security.PublicKey;

public class Shape {
    private String color = "green";
    private boolean filled = true;
    public Shape(){}
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor( String color){
        this.color = color;
    }
    public boolean getFilled(){
        return filled;
    }
    public void setFilled( boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of" + color + "and " + filled + "filled";
    }
}
 class Circle1 extends Shape{
        private double radius = 1.0;
        public Circle1(){}
    public Circle1 (double radius){
            this.radius = radius;
    }
    public Circle1(double raidus, String color, boolean filled){
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
class Rectangle1 extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle1(){}
    public Rectangle1(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle1(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPremeter(){
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "A rectangle with width" + getWidth() +
                " and length" + getLength() + super.toString();
    }
}
class Square1 extends Rectangle1{
    public Square1() {
    }

    public Square1(double side) {
        super(side, side);
    }

    public Square1(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}


