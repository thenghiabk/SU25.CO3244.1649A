package L03_LinkedStack;

class LinkedStackADTTestDrive {
    public static void main ( String[] args ) {
        LinkedStackADT<Integer> myIntStack = new LinkedStackADT<>(); // <Integer>
        myIntStack.push( 10 );
        myIntStack.push( 20 );
        myIntStack.push( 30 );
        myIntStack.push( 40 );
        System.out.println( myIntStack ); // [40, 30, 20, 10]

        myIntStack.pop();
        myIntStack.pop();
        System.out.println( myIntStack ); // [20, 10]

        System.out.println( myIntStack.size() ); // 2

        System.out.println( myIntStack.peek() ); // 20
        System.out.println( myIntStack.peek() ); // 20
        System.out.println( myIntStack.peek() ); // 20
        System.out.println( myIntStack.peek() ); // 20

        System.out.println( myIntStack ); // [20, 10]
    }
}
