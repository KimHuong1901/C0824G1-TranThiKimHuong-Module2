package ss5;

import java.util.Scanner;

public class Student {
    private String name = "John";
    private String classes = "CO2";
    public Student() {}
    protected void setName(String name){
        this.name = name;
    }
    protected void setClasses(String classes){
        this.classes = classes;
    }
    // Test giá trị trả về
//    public String getName(){
//        return this.name;
//    }
//    public String getClasses(){
//        return this.classes;
//    }
}
 class Test {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the name: ");
       String name = sc.nextLine();
       System.out.println("Enter the class: ");
       String classes = sc.nextLine();
       Student s2 = new Student();
       s2.setName(name);
       s2.setClasses(classes);
        //In ra kết quả với 2 phương thức set có access modifier là public:
//       System.out.println("Name is: " + s2.getName() + "and " + "class is: " + s2.getClasses());
     }
}
