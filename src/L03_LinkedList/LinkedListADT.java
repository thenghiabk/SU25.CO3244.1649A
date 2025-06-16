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

    }

    @Override
    public void addLast ( E element ) {

    }

    @Override
    public E removeFirst () {
        return null;
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
