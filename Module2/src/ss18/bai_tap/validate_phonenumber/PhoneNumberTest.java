package ss18.bai_tap.validate_phonenumber;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222), (84)-(22b22222)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String phone : validPhoneNumber){
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("PhoneNumber: " + phone + " is valid: " + isValid);
        }
        for (String phone : invalidPhoneNumber){
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("PhoneNumber: " + phone + " is valid: " + isValid);
        }
    }
}
