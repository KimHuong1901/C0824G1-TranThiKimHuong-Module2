package ss7.bai_tap.bai_2;
public class SquareTest {
    public static void main(String[] args) {
     Square square = new Square();
        System.out.println(square);
        square = new Square(5);
        System.out.println(square);
        square = new Square(5, "blue", false);
        System.out.println(square);
        square.howToColor();
        System.out.println(square);
    }
}
