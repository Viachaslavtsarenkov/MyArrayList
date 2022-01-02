package com.company.List;

import com.company.List.ListImpl.SimpleArrayList;

public interface Collections{

    static <T extends Comparable<T>> MyArrayList<T> sort(MyArrayList<T> array) {
        for (int i = array.getSize() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array.get(j).compareTo(array.get(j + 1)) > 0) {
                    Object temp = array.get(j);
                    array.set(j,array.get(j + 1));
                    array.set(j + 1, (T) temp);
                }
            }
        }
        System.out.println(array.toString());
        return null;
    }
}
