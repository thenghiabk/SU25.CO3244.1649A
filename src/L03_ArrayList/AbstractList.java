package L03_ArrayList;

/**
 * This interface is a blueprint for a list data structure. It provides methods for
 * adding, removing and accessing elements, as well as for checking the size and
 * emptiness of the list.
 */
public interface AbstractList<E> {
    /**
     * Adds an element to the end of the list and increases the size.
     * @param element the element to be added
     * @return true if the element was added, false otherwise
     */
    boolean add(E element);
    /**
     * Adds an element at the specified position in the list and increases the size.
     * @param index the position where the element is to be added
     * @param element the element to be added
     * @return true if the element was added, false otherwise
     */
    boolean add(int index, E element);
    /**
     * Returns the element at the specified position in the list.
     * @param index the position of the element to be returned
     * @return the element at the specified position
     */
    E get(int index);
    /**
     * Replaces the element at the specified position in the list with the
     * specified element.
     * @param index the position of the element to be replaced
     * @param element the element to be added
     * @return the element that was replaced
     */
    E set(int index, E element);
    /**
     * Removes the element at the specified position in the list and decreases the size.
     * @param index the position of the element to be removed
     * @return the element that was removed
     */
    E remove(int index);
    /**
     * Returns the number of elements in the list.
     * @return the size of the list
     */
    int size();
    /**
     * Returns the index of the first occurrence of the specified element in the
     * list, or -1 if the list does not contain the element.
     * @param element the element to be searched
     * @return the index of the first occurrence of the element, or -1 if the list
     * does not contain the element
     */
    int indexOf(E element);
    /**
     * Checks if the list contains the specified element.
     * @param element the element to be searched
     * @return true if the list contains the element, false otherwise
     */
    boolean contains(E element);
    /**
     * Checks if the list is empty.
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();
}