package L03_LinkedQueue;

/**
 * This class implements the AbstractLinkedQueue interface to create a
 * linked list based queue data structure. The queue is a First In First Out (FIFO)
 * data structure, meaning the first element added is the first one to be removed.
 * The class provides methods to add and remove elements from the queue, as well as
 * to check the size and emptiness of the queue.
 */

public class LinkedQueueADT<E> implements AbstractLinkedQueue<E> {
    private class Node {
        // data
        private E element; // the actual element stored in the node
        private Node next;

        // constructor
        public Node ( E element ) {
            this.element = element;
            this.next = null;
        }
    }

    // Reference to the first node in the queue
    private Node head;

    // Reference to the last node in the queue
    private Node tail;

    // The current number of elements in the queue
    private int size;

    // constructor
    public LinkedQueueADT (){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void offer ( E element ) {
        // TODO: Implement the logic to add an element to the end of the queue.
        // Remember to create a new Node and update 'head', 'tail' pointers and 'size' appropriately.
    }

    @Override
    public E poll() {
        // TODO: Implement the logic to remove and return the first element from the queue.
        // Handle the case where the queue is empty by throwing an IllegalStateException.
        // Update 'head', 'tail' pointers (if necessary) and 'size'.
        return null; // Placeholder, will be replaced by actual element in your implementation
    }

    @Override
    public E peek() {
        // TODO: Implement the logic to return the first element without removing it.
        // Handle the case where the queue is empty by throwing an IllegalStateException.
        return null; // Placeholder, will be replaced by actual element in your implementation
    }

    @Override
    public int size () {
        // TODO: Implement the logic to return the current number of elements in the queue.
        return 0; // Placeholder, will be replaced by actual size in your implementation
    }

    @Override
    public boolean isEmpty () {
        // TODO: Implement the logic to check if the queue is empty.
        // Return true if empty, false otherwise.
        return true; // Placeholder, will be replaced by actual check in your implementation
    }

    @Override
    public String toString () {
        // TODO: Implement the logic to return a string representation of the queue.
        // For example, "[element1, element2, ..., lastElement]".
        return "[]"; // Placeholder, will be replaced by actual string in your implementation
    }

}

class LinkedQueueADTRunner {
    public static void main ( String[] args ) {
        // TODO: Understand and expand test cases in main method.
        // These tests will likely fail until LinkedQueueADT methods are implemented.
        LinkedQueueADT<Integer> myQueue = new LinkedQueueADT<>();

        System.out.println(myQueue.isEmpty());

        // System.out.println(myQueue.poll()); // uncomment this line to see the exception

        myQueue.offer( 10 );
        myQueue.offer( 20 );
        myQueue.offer( 30 );
        myQueue.offer( 40 );

        System.out.println("Queue after adding elements: " + myQueue);

        System.out.println("The element at the top of queue: " + myQueue.peek());
        System.out.println("The element at the top of queue: " + myQueue.peek());
        System.out.println("The element at the top of queue: " + myQueue.peek());

        System.out.println("The element at the top of queue: " + myQueue.poll());
        System.out.println("The element at the top of queue: " + myQueue.poll());

        System.out.println(myQueue.size());
    }
}
