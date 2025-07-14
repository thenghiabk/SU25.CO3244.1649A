package L07_Recursion;

public class PrintNumbers {
    public static void main ( String[] args ) {
        int count = 0;
        printNumber(count); // 5,4,3,2,1
    }

    public static void printNumber(int count){
        if (count == 5){ // base condition
            return;
        }

        count++;


        printNumber(count); // recursive call
        System.out.println(count);
    }

}
