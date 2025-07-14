package L07_Recursion;

public class PrintNumbers {
    public static void main ( String[] args ) {
        printNumber1(); // 1, 2, 3, 4, 5
    }

    public static void printNumber1(){
        System.out.println("1");
        printNumber2();
    }

    public static void printNumber2(){
        System.out.println("2");
        printNumber3();
    }

    public static void printNumber3(){
        System.out.println("3");
        printNumber4();
    }

    public static void printNumber4(){
        System.out.println("4");
        printNumber5();
    }

    public static void printNumber5(){
        System.out.println("5");
    }

}
