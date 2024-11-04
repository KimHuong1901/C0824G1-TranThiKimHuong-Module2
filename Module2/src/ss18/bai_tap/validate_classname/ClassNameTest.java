package ss18.bai_tap.validate_classname;

public class ClassNameTest {
    private static ClassName className;
    public static final String[] validClassName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A", "C0223GGGG"};
    public static void main(String[] args) {
        className = new ClassName();
        for (String name : validClassName) {
            boolean isValid = className.validate(name);
            System.out.println("ClassName: " + name + " is valid: " +  isValid);
        }

        for(String name : invalidClassName) {
            boolean isValid = className.validate(name);
            System.out.println("ClassName: " + name + " is valid: " + isValid);
        }
    }
}
