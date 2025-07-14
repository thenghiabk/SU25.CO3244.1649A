package L07_Recursion;

public class Factorial {
    public static void main( String[] args ) {
        // 4! = 4 x 3!
        // n! = n x (n - 1)!

        // System.out.println( factorialLoopSolution( 4 ) ); // should print 24
        
        System.out.println( factorial( 5 ) ); // should print 120
    }


    static int factorial( int n ) {
        if ( n == 0 ) return 1; // base condition
        return n * factorial( n - 1 );
    }






    static int factorialLoopSolution( int n ) {
        var factorial = 1;
        for ( int i = 1; i <= n; i++ ) {
            factorial *= i;
        }
        return factorial;
    }
}

