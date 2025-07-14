package L07_Recursion;

import java.util.Scanner;

public class GuessingGame {

    static Scanner sc = new Scanner( System.in );
    public static void main( String[] args ) {
        final int targetNum = 45;
        System.out.println( "Please guess a number." );
        int guessed = sc.nextInt( ); // new guess
        guessNumber( targetNum, guessed );
    }

    static void guessNumber( int target, int guessed ) {
        System.out.println( "You have guessed number: " + guessed );

        if ( target == guessed ) { // base condition
            System.out.println( "It's correct. Congratulations!" );
            return;
        }

        if ( guessed > target )
            System.out.println( "It should be lower." );
        else
            System.out.println( "It should be higher." );
        System.out.println( "Please guess another number." );

        guessed = sc.nextInt( ); // new guess

        guessNumber( target, guessed ); // recursive function call
    }
}
