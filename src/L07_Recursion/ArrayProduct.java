package L07_Recursion;

public class ArrayProduct {
    public static void main( String[] args ) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println( prod( array, 0 ) );
    }

    static int prod( int[] array, int index ) {
        if ( index == array.length - 1 ) {
            return array[ index ];
        }
        return array[ index ] * prod( array, index + 1 );
    }
}
