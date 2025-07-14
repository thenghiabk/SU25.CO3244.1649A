package L07_Recursion;

public class SayHello {
    public static void main( String[] args ) {
        int count = 0;
        sayHello(count);
    }

    public static void sayHello(int count){
        if (count == 5){ // base condition
            return;
        }

        System.out.println("Hello World");
        count++;
        sayHello(count);
    }

}
