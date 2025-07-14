package L07_Recursion;

public class VectorGenerating {
    public static void main( String[] args ) {
        int[] arr = new int[ 2 ];
        generateVector( arr, 0 );

        /*
        Vector's size = 2

        1.
            vector[0] = 0
                vector[1] = 0 -> print out vector
                vector[1] = 1 -> print out vector
        2.
            vector[0] = 1
                vector[1] = 0 -> print out vector
                vector[1] = 1 -> print out vector
         */
    }
    static void generateVector( int[] vector, int index ) {
        if ( index == vector.length ) { // base condition
            printVector( vector );
        } else {
            for ( int i = 0; i <= 1; i++ ) {
                vector[ index ] = i;
                generateVector( vector, index + 1 );
            }
        }
    }
    static void printVector( int[] vector ) {
        for ( int i = 0; i < vector.length; i++ ) {
            System.out.print( vector[ i ] );
        }
        System.out.println( ); // printing finished
    }
}
