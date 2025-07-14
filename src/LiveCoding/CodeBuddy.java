package LiveCoding;

public class CodeBuddy {
    public static void main ( String[] args ) {
        func1();
    }

    public static void func1(){
        func2();
    }
    public static void func2(){
        func3();
    }
    public static void func3(){
        return;
    }
}
