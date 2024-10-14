package ss5;

public class StudentTh {
    private int id;
    private String name;
    private static String collect = "BBDIT";
    StudentTh (int id, String name) {
        this.id = id;
        this.name = name;
    }
    static void change (){
        collect = "CODEGYM";
    }
    void display (){
        System.out.println(id + " " + name + " " + collect);
    }

    public static void main(String[] args) {
        StudentTh.change();
        StudentTh s1 = new StudentTh(111, "Hoang");
        StudentTh s2 = new StudentTh(222, "Khanh");
        StudentTh s3 = new StudentTh(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
