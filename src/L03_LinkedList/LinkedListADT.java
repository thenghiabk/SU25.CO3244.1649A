package L03_LinkedList;

public class LinkedListADT<E> implements AbtractLinkedList<E> {
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
    private Node<E> head;
    private Node<E> tail;
    private int size;

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
        if (head == null && tail == null) {
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
        return null;
    }

    @Override
    public E getFirst () {
        return null;
    }

    @Override
    public E getLast () {
        return null;
    }

    @Override
    public int size () {
        return 0;
    }

    @Override
    public boolean isEmpty () {
        return false;
    }
}
