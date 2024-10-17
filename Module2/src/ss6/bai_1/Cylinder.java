package ss6.bai_1;

class Cylinder extends Circle {
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

    public double getVolume(){
        return Math.PI *heigth* getRadius() * getRadius() ;
    }

    @Override
    public String toString() {
        return "Radius is: " + getRadius() + " with color is: " + getColor()+ ", heigth = " + heigth +" with volume is: " + getVolume() + " and area is: " + getArea() ;
    }

    public static void main(String[] args) {
        Circle circle = new Circle( 5, "blue");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder( 6, "red", 7);
        System.out.println(cylinder);
    }
}
