package ss15;

public class X {
//    // 1
//    public static void main(String [] args)     {
//        try {
//            badMethod();
//            System.out.print("A");
//        }catch (RuntimeException ex){
//            System.out.print("B");
//        }catch (Exception ex1){
//            System.out.print("C");
//        }finally{
//            System.out.print("D");
//        }
//        System.out.print("E");
//    }
//    public static void badMethod(){
//        throw new RuntimeException();
//    }
//    //2
//public static void main(String [] args) {
//    try         {
//        badMethod();
//        System.out.print("A");
//    }  catch (Exception ex)  {
//        System.out.print("B");
//    } finally {
//        System.out.print("C");
//    }
//    System.out.print("D");
//}
//    public static void badMethod(){
//        throw new Error();
//    }
    // 4:
public static void main(String[] args) {
    try {
        return;
    }
    finally{
        System.out.println( "Finally" );
    }
}
}
