package org.example.collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //Arrrays as List creates an unmodifiable list
        List<String> list = Arrays.asList("Bohr", "Darwin", "Galilei", "Tesla", "Einstein", "Newton");
        list.sort(Comparator.comparing(String::length));

        System.out.println(list);

        // Remove if
        List<String> modifiedList = new ArrayList<>(list);
        modifiedList.removeIf(w-> w.length() < 6);
        System.out.println(modifiedList);

        //Merge
        Map<String, String> names = new HashMap<>();
        names.put("Albert", "Ein?");
        names.put("Marie", "Curie");
        names.put("Max", "Plank");

        names.merge("Albert", "stein", (old, val) -> old.substring(0,3) + val);
        System.out.println(names);

        names.merge("Newname", "munoz", (old, val) -> old.substring(0,3)+val);
        System.out.println(names);
    }
}
