package L03_LinkedList;

public class LinkedListADT<E> implements AbstractLinkedList<E> {
    private class Node<E>{
        // attributes
        private E element;
        private Node<E> next;

        // constructor
        public Node ( E element ) {
            this.element = element;
            this.next = null;
        }
    }

     // attributes
    private Node<E> head; // Reference to the first node in the queue
    private Node<E> tail; // Reference to the last node in the queue
    private int size; // The current number of elements in the queue

    // constructor
    public LinkedListADT () {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addFirst ( E element ) {
        Node<E> newNode = new Node<>(element);

        // if the list is empty
        if (this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else { // if the list is not empty
            newNode.next = this.head;
            this.head = newNode;
        }

        this.size++;
    }

    @Override
    public void addLast ( E element ) {
        Node<E> newNode = new Node<>(element);

        // if the list is empty
        if (head == null && tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else { // if the list is not empty
            this.tail.next = newNode;
            this.tail = newNode;
        }

        this.size++;
    }

    @Override
    public E removeFirst () {

        // if the list is empty
        if (head == null && tail == null) {
            throw new IllegalStateException("List is empty");
        }

        E oldElement = this.head.element;

        if (head == tail){ // if the list has only one element
            this.head = null;
            this.tail = null;
        } else { // if the list has more than one element
            Node<E> tempNode = this.head;
            this.head = this.head.next;
            tempNode.next = null;
        }

        this.size--;
        return oldElement;
    }

    @Override
    public E removeLast () {
        // if the list is empty
        if (head == null && tail == null) {
            throw new IllegalStateException("List is empty");
        }

        E oldElement = this.tail.element;

        if (head == tail){ // if the list has only one element
            this.head = null;
            this.tail = null;
        } else { // if the list has more than one element
            Node<E> tempNode = this.head;
            while (tempNode.next != this.tail) {
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            this.tail = tempNode;
        }

        this.size--;
        return oldElement;
    }

    @Override
    public E getFirst () {
        // if the list is empty
        if (head == null && tail == null) {
            throw new IllegalStateException("List is empty");
        }

        return this.head.element;
    }

    @Override
    public E getLast () {
        // if the list is empty
        if (head == null && tail == null) {
            throw new IllegalStateException("List is empty");
        }

        return this.tail.element;
    }

    @Override
    public int size () {
        return this.size;
    }

    @Override
    public boolean isEmpty () {
        if (this.head == null && this.tail == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        Node<E> tempNode = this.head;
        while (tempNode != null) {
            result.append(tempNode.element);
            if (tempNode.next != null) {
                result.append(", ");
            }
            tempNode = tempNode.next;
        }

        result.append("]");
        return result.toString();
    }
}

class LinkedListADTTestDrive {
    public static void main ( String[] args ) {
        LinkedListADT<Integer> myIntList = new LinkedListADT<>();
        myIntList.addFirst(10);
        myIntList.addFirst(20);
        myIntList.addFirst(30);
        myIntList.addLast(40);
        myIntList.addLast(50);
        System.out.println(myIntList); // [30, 20, 10, 40, 50]
    }
}
