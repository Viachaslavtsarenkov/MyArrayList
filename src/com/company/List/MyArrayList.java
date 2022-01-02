package com.company.List;

import java.io.Serializable;
import java.util.Comparator;

public interface MyArrayList<T> extends Serializable {

    /**
     * Adds element into list
     *
     * @param element contains element for adding
     * @return true if element was added
     * **/
    boolean add(T element);

    /**
     * Adds element into list on the particular position
     *
     * @param element contains element for adding
     * @param index contains position for adding
     * @return true if element was added
     * **/
    boolean add(int index, T element);

    /**
     * Removes element from list by index
     *
     * @param index contains position of the element for removing
     * @return true if element was removed
     * **/
    boolean remove(int index);

    /**
     * Removes particular element
     *
     * @param o contains element is needed for removing
     * @return true if element was removed
     * **/
    boolean remove(T o);

    /**
     * Gets particular element by index
     *
     * @param index contains index of the element
     * @return element from the list
     * @throws IndexOutOfBoundsException if an error occurs while getting data of list
     * **/
    T get(int index);

    /**
     * Get list size
     *
     * @return list size
     * **/
    int getSize();

    /**
     * Replace element on the particular position
     *
     * @param index contains position if the element for replacing
     * @throws IndexOutOfBoundsException if an error occurs while replacing data of list
     * **/
    void set(int index, T element);

    /**
     * Sort list by comparator
     *
     * @param comparator contains comparator for sorting
     * **/
    void sort(Comparator<? super T> comparator);
}
