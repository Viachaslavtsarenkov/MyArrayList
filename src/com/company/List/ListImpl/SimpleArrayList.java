package com.company.List.ListImpl;

import com.company.List.MyArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class SimpleArrayList<T> implements MyArrayList<T>{

    private static final int INITIAL_CAPACITY = 16;
    private static int size = 0;
    private Object[] array;

    public SimpleArrayList() {
        array = new Object[INITIAL_CAPACITY];
    }

    public SimpleArrayList(int initialCapacity) {
        array = new Object[initialCapacity];
    }

    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public boolean add(int index, T element) {
        if (index > size) {
            return false;
        }

        for (int i = size + 1; i > index; --i) {
            array[i] = array[i - 1];
        }

        array[index] = element;
        ++size;
        return true;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(T o) {
        int index = findIndexElement(o);

        if(index < 0) {
          return false;
        }

        for(int i = index; i < size; ++i) {
            array[i] = array[i + 1];
        }

        --size;
        return true;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void set(int index, T element) {

    }

    @Override
    public void sort() {

    }

    @Override
    public void sort(Comparator<? super  T> comparator) {

    }
    
    private void resize() {

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
