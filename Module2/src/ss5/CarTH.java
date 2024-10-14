package ss5;

public class CarTH {
    private String name;
    private String engine;
    private static int numberOfCars;
    public CarTH(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public static void main(String[] args) {
        CarTH cars = new CarTH("Mazda 3", "Skyactiv 3");
        System.out.println(CarTH.numberOfCars);
        CarTH cars2 = new CarTH("Mazda 6", "Skyactiv 6");
        System.out.println(CarTH.numberOfCars);
    }
}
