package L03_ArrayList;

public class ArrayListADT<E> implements AbstractList<E> {
    // attributes
    private E[] elements;
    private int nextIndex;

    // constructor
    public ArrayListADT () {
        this.elements = (E[]) new Object[3];
        this.nextIndex = 0;
    }


    @Override
    public boolean add ( E element ) {
        if (nextIndex == elements.length) {
            E[] largerElements = (E[]) new Object[elements.length * 2];

            for ( int i = 0; i < elements.length; i++ ) {
                largerElements[i] = elements[i];
            }

            elements = largerElements;
        }

        elements[nextIndex] = element;
        nextIndex++;
        return true;
    }

    @Override
    public boolean add ( int index, E element ) {

        if (index < 0 || index > nextIndex) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (nextIndex == elements.length) {
            E[] largerElements = (E[]) new Object[elements.length * 2];

            for ( int i = 0; i < elements.length; i++ ) {
                largerElements[i] = elements[i];
            }

            elements = largerElements;
        }

        // shift elements to the right
        for ( int i = nextIndex; i > index; i-- ) {
            elements[i] = elements[i - 1];
        }

        elements[index] = element;
        nextIndex++;

        return true;
    }

    @Override
    public E get ( int index ) {
        return null;
    }

    @Override
    public E set ( int index, E element ) {
        return null;
    }

    @Override
    public E remove ( int index ) {
        return null;
    }

    @Override
    public int size () {
        return 0;
    }

    @Override
    public int indexOf ( E element ) {
        return 0;
    }

    @Override
    public boolean contains ( E element ) {
        return false;
    }

    @Override
    public boolean isEmpty () {
        return false;
    }
}
