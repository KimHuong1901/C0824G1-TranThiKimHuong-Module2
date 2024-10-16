package ss7.thuc_hanh.th2;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
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
