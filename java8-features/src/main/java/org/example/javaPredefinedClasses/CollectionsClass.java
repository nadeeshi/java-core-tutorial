package org.example.javaPredefinedClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {

    private List<String> addingElementToList() {
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("Java");
        list.add("Python");

        System.out.println("Initial collection value: " + list);

        Collections.addAll(list, ".Net", "C#");
        System.out.println("After adding elements to list: " + list);

        return list;
    }

    private int findMaxMin() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(45);
        list.add(67);
        list.add(34);
        list.add(23);

        int max = Collections.max(list);

        System.out.println("Max: " + max);
        System.out.println("Min: " + Collections.min(list));

        return max;
    }

    private void sortList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(45);
        list.add(67);
        list.add(34);
        list.add(23);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        //Sort the list and return comparator for reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse order List: " + list);
    }

    public static void main(String[] args) {
        CollectionsClass collectionsClass = new CollectionsClass();
        collectionsClass.addingElementToList();

        collectionsClass.findMaxMin();

        collectionsClass.sortList();
    }
}
