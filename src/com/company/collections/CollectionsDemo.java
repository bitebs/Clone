package com.company.collections;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("2");
        list.add(new Date());

        for (Object object:list)
            System.out.println(object);

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");

        list2.forEach(System.out::println);
        System.out.println(list2.size());
    }
}
