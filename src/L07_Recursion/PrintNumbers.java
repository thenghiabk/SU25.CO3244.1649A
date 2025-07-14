package L07_Recursion;

public class PrintNumbers {
    public static void main ( String[] args ) {
        int count = 1;
        printNumber(count); // 1, 2, 3, 4, 5
    }

    public static void printNumber(int count){
        if (count > 5){ // base condition
            return;
        }

        System.out.println(count);
        count++;

        printNumber(count); // recursive call
    }

}
