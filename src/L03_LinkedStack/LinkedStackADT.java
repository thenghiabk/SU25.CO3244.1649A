package L03_LinkedStack;

public class LinkedStackADT<E> implements AbstractLinkedStack<E> {
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
    private Node<E> top;
    private int size;

    // Constructor
    public LinkedStackADT () {
        this.top = null;
        this.size = 0;
    }

    @Override
    public void push ( E element ) {

    }

    @Override
    public E pop () {
        return null;
    }

    @Override
    public E peek () {
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
