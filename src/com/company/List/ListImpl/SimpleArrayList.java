package com.company.List.ListImpl;

import com.company.List.MyArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class SimpleArrayList<T> implements MyArrayList<T>{

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
        array[size + 1] = element;
        return true;
    }

    @Override
    public boolean add(int index, T element) {
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

        if(index < 0) {
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
    public void sort() {

    }

    @Override
    public void sort(Comparator<? super  T> comparator) {

    }


    private void resize() {
        Object[] newArray = new Object[size * 2];
        for (int i = 0; i < size; ++i) {
            newArray[i] = array[i + 1];
        }
        array = newArray;
    }

    private void shiftLeft(int index) {
        for(int i = index; i < size; ++i) {
            array[i] = array[i + 1];
        }
    }

    private void shiftRight(int size, int index) {
        for (int i = size + 1; i > index; --i) {
            array[i] = array[i - 1];
        }
    }

    private int findIndexElement(T element) {
        int index = - 1;
        for(int i = 0; i < size; ++i) {
            if(array[i].equals(element)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
