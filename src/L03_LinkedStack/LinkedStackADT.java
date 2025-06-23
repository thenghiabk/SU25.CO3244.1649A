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
        Node<E> newNode = new Node<>(element);

        // if the stack is empty
        if (this.top == null) {
            this.top = newNode;
        } else { // if the stack is not empty
            newNode.next = this.top;
            this.top = newNode;
        }

        this.size++;
    }

    @Override
    public E pop () {
        // if the stack is empty
        if (this.top == null) {
            throw new IllegalStateException("Stack is empty");
        }

        // if the stack is not empty
        E oldElement = this.top.element;

        Node<E> tempNode = this.top;
        this.top = this.top.next;
        tempNode.next = null;

        this.size--;
        return oldElement;
    }

    @Override
    public E peek () {
        // if the stack is empty
        if (this.top == null) {
            throw new IllegalStateException("Stack is empty");
        }

        return this.top.element;
    }

    @Override
    public int size () {
        return this.size;
    }

    @Override
    public boolean isEmpty () {
        if (this.top == null && this.size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        Node<E> tempNode = this.top;
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

class LinkedStackTestDrive {
    public static void main ( String[] args ) {
        LinkedStackADT<Integer> myIntStack = new LinkedStackADT<>(); // <Integer>
        myIntStack.push(10);
        myIntStack.push(20);
        myIntStack.push(30);
        myIntStack.push(40);
        System.out.println(myIntStack); // [40, 30, 20, 10]

        myIntStack.pop();
        myIntStack.pop();
        System.out.println(myIntStack); // [20, 10]

        System.out.println(myIntStack.size()); // 2

        System.out.println(myIntStack.peek()); // 20
        System.out.println(myIntStack.peek()); // 20
        System.out.println(myIntStack.peek()); // 20
        System.out.println(myIntStack.peek()); // 20

        System.out.println(myIntStack); // [20, 10]
    }
}
