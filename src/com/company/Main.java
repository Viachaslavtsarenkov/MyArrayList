package com.company;

import com.company.List.ListImpl.SimpleArrayList;
import com.company.List.MyArrayList;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyArrayList<Person> simpleArrayList = new SimpleArrayList<>();

        // добавляем объекты Person в коллекцию
        simpleArrayList.add(0, new Person("John", 33));
        simpleArrayList.add(1, new Person("Adam", 21));
        simpleArrayList.add(2, new Person("Adam", 23));
        simpleArrayList.add(3, new Person("David", 29));
        simpleArrayList.add(4, new Person("Thom", 26));
        System.out.println("Initial array list");
        System.out.println(simpleArrayList);


        // сортируем людей по возрасту с помощью своего компаратора
        System.out.println("\n*** sort by age ***");
        simpleArrayList.sort(new ByAgePersonComparator());
        System.out.println(simpleArrayList);

        // сортируем по имени с помощью компаратора, реализованного через ссылку на метод
        System.out.println("\n*** sort by name ***");
        simpleArrayList.sort(Comparator.comparing(Person::getName));
        System.out.println(simpleArrayList);

        // удаляем из коллекции элемент с индексом 0
        System.out.println("\n*** deleting element with index 0 (should return true and remove element) ***");
        System.out.println(simpleArrayList.remove(0));
        System.out.println(simpleArrayList);

        // пытаемся удалить несуществующий элемент с индексом 4
        System.out.println("\n*** deleting element with index 4 (should return false) ***");
        System.out.println(simpleArrayList.remove(4));
        System.out.println(simpleArrayList);
>>>>>>> main
    }
}
