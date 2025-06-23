package L03_LinkedQueue;

public interface AbstractLinkedQueue<E> {
    /**
     * Adds an element at the end of the queue and increases the size.
     * If the queue is empty, the new element becomes the head and tail.
     * @param element the element to be added
     */
    void offer(E element);

    /**
     * Removes and returns the first element from the queue.
     * If the queue is empty, throws an IllegalStateException.
     * @return the element that was removed from the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    E poll();

    /**
     * Returns the first element in the queue without removing it.
     * If the queue is empty, throws an IllegalStateException.
     *
     * @return the first element in the queue
     * @throws IllegalStateException if the queue is empty
     */
    E peek();

    /**
     * Returns the number of elements in the stack
     * @return the number of elements in the stack
     */
    int size();

    /**
     * Returns if the stack contains any elements or not.
     * @return if the stack contains any elements or not.
     */
    boolean isEmpty();
}
