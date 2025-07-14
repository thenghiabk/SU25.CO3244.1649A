package L06_AlgorithmAnalysis;

public class ComplexityExercise {
    static void exercise1( int n ) {
        int sum = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 1; j < n; j = j * 2 ) {
                sum++;
            }
        }
    }

    static void exercise2( int n ) {
        int sum = 0;
        for ( int i = 1; i < n * n; i++ ) {
            sum = sum + 1;
        }
    }
    static void exercise3( int n ) {
        int i = n;
        int sum = 0;
        while ( i > 0 ) {
            sum = sum + i;
            i = i / 2;
        }
    }
    static void exercise4( int n ) {
        int sum = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                sum++;
            }
        }
    }
    static void exercise5( int n ) {
        int sum = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 1; j < i; j++ ) {
                sum++;
            }
        }
    }

    static void exercise6( int n ) {
        int product = 1;
        for ( int i = 1; i <= n; i++ ) {
            for ( int j = 1; j <= i; j++ ) {
                product *= 2;
            }
        }
    }
}
