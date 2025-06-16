package L03_Node;

class Node<E> {
    // attributes
    public E element;
    public Node<E> next;

    // constructor
    public Node ( E element ) {
        this.element = element;
    }
}

public class NodeExample {
    public static void main ( String[] args ) {
        Node<Integer> n0 = new Node<>(10);
        Node<Integer> head = n0;
        Node<Integer> n1 = new Node<>(20);
        head.next = n1;

        Node<Integer> newNode = new Node<>(30);
        head.next.next = newNode;

        head.next.next.element = 50; // change the value

    }
}
