package L03_LinkedStack;

public interface AbstractLinkedStack<E> {
    /**
     * Adds an element at the top of the stack and increases the size.
     *
     * @param element the element to be added to the stack
     */
    void push(E element);

    /**
     * Removes and returns the top element from the stack, decreasing the size.
     *
     * @return the element removed from the top of the stack
     * @throws IllegalStateException if the stack is empty
     */
    E pop();

    /**
     * Returns the top element from the stack without removing it.
     *
     * @return the top element of the stack
     * @throws IllegalStateException if the stack is empty
     */
    E peek();

    /**
     * Returns the number of elements in the stack.
     *
     * @return the size of the stack
     */
    int size();

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();
}