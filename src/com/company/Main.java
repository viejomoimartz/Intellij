package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //create an arraylist
        //add items and print
        //ordered collection
        ArrayList<String> list = new ArrayList<String>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");
        System.out.println(list);

        //create iretators for arraylist
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            //use the hasnext and method to iterate through items of arraylist
            String value = listIterator.next();
            System.out.println(value);
        }


        //create a hash map
        //add items and print
        //hashmap works with keys and values
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

        //iterate through items of hashmap
        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println("The capital of: " + value + " is " + map.get(value));
        }
    }
}