package L07_Recursion;

public class ArraySum {
    public static void main( String[] args ) {
        int[] array = { 1, 2, 3, 4, 5 };

        System.out.println( sum( array, 0 ) ); // starts from index 0
    }
    static int sum( int[] array, int index ) {
        if ( index == array.length - 1 ) {
            return array[ index ];
        }
        return array[ index ] + sum( array, index + 1 );
    }
}
