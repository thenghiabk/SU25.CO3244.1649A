package L07_Recursion;

public class Fibonacci {
    public static void main( String[] args ) {
        //              index: 0  1  2  3  4  5  6  7  8
        // Fibonacci Sequence: 0  1  1  2  3  5  8  13 21

        System.out.println( fibonacci( 4 ) ); // should print 3

        /* Illustration
                                f(4)
                             /        \
                           f(2)       f(3)
                          /    \     /    \
                       f(0)   f(1) f(1)   f(2)
                                         /    \
                                       f(0)   f(1)
         */

        // Print first 10 numbers of Fibonacci sequence
        for ( int i = 0; i < 9; i++ ) {
            System.out.println( fibonacci( i ) );
        }
    }
    static int fibonacci( int n ) {
        if ( n < 2 ) { // base condition
            return n;
        }
        return fibonacci( n - 2 ) + fibonacci( n - 1 );
    }
}
