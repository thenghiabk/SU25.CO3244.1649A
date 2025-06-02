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
            E[] biggerElements = (E[]) new Object[elements.length * 2];

            for ( int i = 0; i < elements.length; i++ ) {
                biggerElements[i] = elements[i];
            }

            elements = biggerElements;
        }

        elements[nextIndex] = element;
        nextIndex++;
        return false;
    }

    @Override
    public boolean add ( int index, E element ) {
        return false;
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
