package L03_LinkedQueue;

class LinkedQueueADTTestDrive {
    public static void main ( String[] args ) {
        LinkedQueueADT<Integer> myQueue = new LinkedQueueADT<>();

        System.out.println( myQueue.isEmpty() );

        // System.out.println(myQueue.poll()); // uncomment this line to see the exception

        myQueue.offer( 10 );
        myQueue.offer( 20 );
        myQueue.offer( 30 );
        myQueue.offer( 40 );

        System.out.println( "Queue after adding elements: " + myQueue ); // [10, 20, 30, 40]

        System.out.println( "The element at the top of queue: " + myQueue.peek() ); // 10
        System.out.println( "The element at the top of queue: " + myQueue.peek() ); // 10
        System.out.println( "The element at the top of queue: " + myQueue.peek() ); // 10

        System.out.println( "The element at the top of queue: " + myQueue.poll() ); // 10
        System.out.println( "The element at the top of queue: " + myQueue.poll() ); // 20

        System.out.println( myQueue.size() ); // 2

        System.out.println( "Queue after removing elements: " + myQueue ); // [30, 40]
    }
}
