package com.company.List.ListImpl;

import com.company.List.MyArrayList;

import java.util.Comparator;

public class SimpleArrayList<T> implements MyArrayList<T> {

    private static final int INITIAL_CAPACITY = 16;
    private int size = 0;
    private Object[] array;

    public SimpleArrayList() {
        array = new Object[INITIAL_CAPACITY];
    }

    public SimpleArrayList(int initialCapacity) {
        array = new Object[initialCapacity];
    }

    @Override
    public boolean add(T element) {
        if (array.length * 0.75 < size) {
            resize();
        }
        array[size] = element;
        ++size;
        return true;
    }

    @Override
    public boolean add(int index, T element) {
        if (array.length * 0.75 < size) {
            resize();
        }
        if (index > size) {
            return false;
        }
        shiftRight(size, index);
        array[index] = element;
        ++size;
        return true;
    }

    @Override
    public boolean remove(int index) {
        if(index < 0 || index > size) {
            return false;
        }
        shiftLeft(index);
        --size;
        return true;
    }

    @Override
    public boolean remove(T o) {
        int index = findIndexElement(o);

        if (index < 0) {
            return false;
        }
        shiftLeft(index);
        --size;
        return true;
    }


    @Override
    public T get(int index) {
        if(size < index) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void set(int index, T element) {
        if(size < index) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = element;
    }

    @Override
    public void sort(Comparator<? super T> comparator) {
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare((T) array[j], (T) array[j + 1]) > 0) {
                    Object temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Change list size
     * **/
    private void resize() {
        Object[] newArray = new Object[size * 2];
        for (int i = 0; i < size; ++i) {
            newArray[i] = array[i + 1];
        }
        array = newArray;
    }

     /**
     * allows to shift elements to the left for removing
     * **/
    private void shiftLeft(int index) {
        for(int i = index; i < size; ++i) {
            array[i] = array[i + 1];
        }
    }

    /**
     * allows to shift elements to the left for adding a new
     * **/
    private void shiftRight(int size, int index) {
        for (int i = size + 1; i > index; --i) {
            array[i] = array[i - 1];
        }
    }

    /**
     * Gets index of the element
     *
     * @param element contains element
     * **/
    private int findIndexElement(T element) {
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (array[i].equals(element)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) sb.append(array[i]).append(", ");
        int lastComma = sb.lastIndexOf(", ");
        sb.replace(lastComma, lastComma + 1, "]");
        return sb.toString();
    }
}