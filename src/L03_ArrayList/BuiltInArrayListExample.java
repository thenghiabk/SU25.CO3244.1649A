package L03_ArrayList;

import java.util.ArrayList;

public class BuiltInArrayListExample {
    public static void main ( String[] args ) {
        ArrayList<Integer> myIntList = new ArrayList<>(); // <Integer>
        myIntList.add( 10 );
        myIntList.add( 20 );
        myIntList.add( 30 );
        myIntList.add( 40 );
        myIntList.add( 50 );
        System.out.println(myIntList);
        System.out.println(myIntList.size());

        //ArrayList<String> myStringList = new ArrayList<>(); // <String>
        //myStringList.add( "Hello" );
        //myStringList.add( "World" );
        //System.out.println(myStringList);

    }
}
