package L03_LinkedList;

public interface AbstractLinkedList<E> {
    /**
     * Adds an element at the front of the collection and increases the size.
     *
     * @param element the element to be added
     */
    void addFirst(E element);

    /**
     * Adds an element at the end of the collection and increases the size.
     *
     * @param element the element to be added
     */
    void addLast(E element);

    /**
     * Removes and returns the first element of the collection.
     * Throws an IllegalStateException if the collection is empty.
     *
     * @return the removed first element
     * @throws IllegalStateException if the collection is empty
     */
    E removeFirst();

    /**
     * Removes and returns the last element of the collection.
     * Throws an IllegalStateException if the collection is empty.
     *
     * @return the removed last element
     * @throws IllegalStateException if the collection is empty
     */
    E removeLast();

    /**
     * Returns the first element of the collection without removing it.
     * Throws an IllegalStateException if the collection is empty.
     *
     * @return the first element
     * @throws IllegalStateException if the collection is empty
     */
    E getFirst();

    /**
     * Returns the last element of the collection without removing it.
     * Throws an IllegalStateException if the collection is empty.
     *
     * @return the last element
     * @throws IllegalStateException if the collection is empty
     */
    E getLast();

    /**
     * Returns the number of elements in the collection.
     *
     * @return the size of the collection
     */
    int size();

    /**
     * Checks if the collection is empty.
     *
     * @return true if the collection is empty, false otherwise
     */
    boolean isEmpty();
}