package ss1_java_overview.bai_tap;

public class ex {
public void loop(){
    int x = 0;
//    while(1){}
}

    volatile int sleepTime;
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 5; i<9;){
            sum +=i;
            i++;
        }
        System.out.println(sum);
//        int x = 100;
//        double y = 100.1;
//        boolean b = (x = y);
//        System.out.println(b);
//        ex  e = new HuMan();
//        HuMan e2 = e;
//        System.out.println(e + "," + e2);
//   }
//public String toString(){
//        return "ABC";
//}
//class HuMan extends ex{
//        public String toString(){
//            return "HuMan";
//        }
//}
//final class outer{}
//    public class default{}
}
}


//public class ex {
//    static public int X = 2;
//
//    static {
//        X = 1;
//    }
//
//    static public void method() {
//        X = 5;
//    }
//
//    public static void main(String[] args) {
//        ex o = new ex();
//        ex.method();
//        ex.X = 10;
//        System.out.printf("x=%d, y=%d", o.X, ex.X);
//    }
//}
//public class ex {
//    static public int X = 2;
//
//    public static void main(String[] args) {
//        ex o1 = new ex();
//        ex o2 = new ex();
//        o2.X = 5;
//        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, ex.X);
//    }
//}
//class ex {
//    void method(int x, int y) {
//        x = 5;
//        y = 5;
//    }
//
//    public static void main(String[] args) {
//        ex o = new ex();
//        int x = 1, y = 1;
//        o.method(x, y);
//        System.out.printf("x=%d, y=%d", x, y);
//
//    }
//}
//public class Parent {
//    public void method() {}
//}
//
//public class Child extends Parent {
//    protected void method;
//}
