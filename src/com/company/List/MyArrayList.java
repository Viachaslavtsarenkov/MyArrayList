package com.company.List;

import java.io.Serializable;
import java.util.Comparator;

public interface MyArrayList<T> extends Serializable {

    boolean add(T element);
    boolean add(int index, T element);
    boolean remove(int index);
    boolean remove(T o);
    T get(int index);
    int getSize();
    void set(int index, T element);
    void sort(Comparator<? super T> comparator);
}
