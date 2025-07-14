package L06_AlgorithmAnalysis;

public class Complexity {

    // O(1)
    static void prinItems( int[] numbers ) {
        System.out.println( numbers[ 0 ] );
        System.out.println( numbers[ 1 ] );
    }

    // O(1)
    static int sum1( int x, int y ) {
        int result = x + y;
        return result;
    }

    // O(n)
    static int sum2( int n ) {
        int sum = 0;

        for ( int i = 1; i <= n; i++ ) {
            sum += i;
        }

        return sum;
    }

    // O(n)
    static void log2( int[] numbers ) {
        for ( int i = 0; i < numbers.length; i++ ) {
            System.out.println( numbers[ i ] ); // <--
        }
    }

    // O(n)
    static void log3( int[] numbers ) {
        System.out.println( "Array: " );
        for ( int number : numbers ) {
            System.out.println( number );
        }
    }

    // O(n^3)
    static void log4( int[] numbers ) {
        for ( int first : numbers ) {
            for ( int second : numbers ) {
                for ( int third : numbers ) {
                    System.out.println( first + second + third ); // n^3
                }
            }
        }
    }

    // O(n)
    static void multipleLoops( int[] numbers, String[] names ) {
        for ( int number : numbers ) {
            System.out.println( number );
        }

        for ( String name : names ) {
            System.out.println( name );
        }
    }

    // O(n^2)
    static void print( int n ) {
        for ( int i = 0; i <= n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                System.out.printf( "%d = %d", i, j ); // ?
            }
            System.out.println( "End of inner loop" ); // n+1
        }
        System.out.println( "End of outer loop" ); // 1
    }

    /*
        O(1): constant
        O(n): linear
        O(n^2): quadratic
     */

}


