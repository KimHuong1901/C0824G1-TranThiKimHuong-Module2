package ss18.thuc_hanh.th2;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String [] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefg"};
    public static final String []invalidAccount = new String[]{".@", "12345", "1234_", "abcde "};
    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean valid = accountExample.validateAccount(account);
            System.out.println("Account " + account + ": " + valid);
        }
        for (String account : invalidAccount) {
            boolean valid = accountExample.validateAccount(account);
            System.out.println("Account " + account + ": " + valid);
        }
    }
}
