package ua.com.juja.core.Collections.Lab40.SimpleArrayList;


import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SimpleArrayList<E> implements SimpleList<E> {


    public static void main(String[] args) {
        Integer[] listElements = {1, 2, 3, 4, 5, 6, 7};
        Integer[] expectedElements = {2, 3, 4, 5, 6, 7};

        SimpleArrayList<Integer> arrayList = new SimpleArrayList<>();

        for (int i = 0; i < listElements.length; i++) {
            arrayList.add(listElements[i]);
        }

        SimpleArrayList<Integer> expectedArrayList = new SimpleArrayList<>();

        for (int i = 0; i < expectedElements.length; i++) {
            expectedArrayList.add(expectedElements[i]);
        }

        Iterator<Integer> iterator = null;
        iterator = arrayList.iterator();

        iterator.next();
        iterator.remove();


    }

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
        private int cursor = 0;
        private SimpleArrayList<E> simpleArrayList = new SimpleArrayList();
        E current;
        private int lastRet;

        public boolean hasNext() {
            return cursor != size;
        }

        public E next() {

            if(this.hasNext()) {
                E current = data[cursor];
                lastRet = cursor;
                cursor ++;
                return current;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (lastRet < 0)
                throw new IllegalStateException();

            try {
                SimpleArrayList.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
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