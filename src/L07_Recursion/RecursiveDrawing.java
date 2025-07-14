package L07_Recursion;

public class RecursiveDrawing {
    public static void main( String[] args ) {
        printFigure( 5 );
    }
    static void printFigure( int n ) {
        if ( n == 0 ) {
            return;
        }
        printLineOfChars( '*', n );
        printFigure( n - 1 ); // <-- recursion call
        printLineOfChars( '#', n );
    }
    static void printLineOfChars( char ch, int n ) {
        for ( int i = 0; i < n; i++ )
            System.out.print( ch );
        System.out.println( );
    }
}
