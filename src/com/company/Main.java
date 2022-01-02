package com.company;

import com.company.List.ListImpl.SimpleArrayList;

public class Main {

    public static void main(String[] args) {
        SimpleArrayList<Integer> arrayList = new SimpleArrayList<>();
        arrayList.add(123);
        arrayList.add(2342);
        arrayList.add(234);
        for(int i = 0; i < arrayList.getSize(); ++ i) {
            System.out.println(arrayList.get(i));
        }
    }
}
