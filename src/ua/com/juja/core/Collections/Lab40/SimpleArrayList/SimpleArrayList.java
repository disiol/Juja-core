package ua.com.juja.core.Collections.Lab40.SimpleArrayList;


import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SimpleArrayList<E> implements SimpleList<E> {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] data;
    private int size = 0;

    public SimpleArrayList() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public SimpleArrayList(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
    }

    @Override
    public boolean add(E newElement) {
        ensureCapacity(size + 1);
        data[size] = newElement;
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return data[index];
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        E oldValue = data[index];
        int numMoved = size - index - 1;
        System.arraycopy(data, index + 1, data, index, numMoved);
        data[--size] = null;
        return oldValue;
    }

    private void rangeCheck(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = Math.max(minCapacity, data.length + (data.length >> 1));
            E[] newData = (E[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            this.data = newData;
        }
    }


    @Override
    public Iterator<E> iterator() {

        return new SimpleArrayListIterator();
    }


    private class SimpleArrayListIterator implements
            Iterator<E> {
        private int cursor;

        public SimpleArrayListIterator() {
            this.cursor = 0;
        }

        public boolean hasNext() {
            return cursor != size;
        }

        public E next() {
            E current;
            if (data[cursor] == null) {
                throw new NoSuchElementException();
            } else
                current = data[cursor];
            cursor++;
            return current;

        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


}


interface SimpleList<E> {
    public boolean add(E newElement);

    public E get(int index);

    public Iterator<E> iterator();

    public int size();

    public boolean isEmpty();

    public E remove(int index);
}