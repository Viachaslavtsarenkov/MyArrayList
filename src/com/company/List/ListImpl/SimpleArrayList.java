package com.company.List.ListImpl;

import com.company.List.MyArrayList;

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
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
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

    @Override
    public String toString() {
        return super.toString();
    }
}
