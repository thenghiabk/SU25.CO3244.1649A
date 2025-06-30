package L03_LinkedList;

class LinkedListADTTestDrive {
    public static void main ( String[] args ) {
        LinkedListADT<Integer> myIntList = new LinkedListADT<>();
        myIntList.addFirst( 10 );
        myIntList.addFirst( 20 );
        myIntList.addFirst( 30 );
        myIntList.addLast( 40 );
        myIntList.addLast( 50 );
        System.out.println( myIntList ); // [30, 20, 10, 40, 50]
    }
}
