package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    /*
    Similar to collections but
    - Don't store their own data
    - The data comes from elsewhere
    - Immutable
    - Lazy
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bohr", "Darwin", "Galilei", "Tesla", "Einstein", "Newton", "Newton");

        //Filtering and limiting
        Stream<String> filteredStream = list.stream().filter(n -> n.length() > 5).limit(5);

        // Collecting results
        List<String> filteredList = filteredStream.collect(Collectors.toList());
        System.out.println(filteredList);
        filteredStream = list.stream().filter(n -> n.length() > 5).limit(3);
        Set<String> filteredSet = filteredStream.collect(Collectors.toSet());
        System.out.println(filteredSet);


        //Applying function to element
        Stream<String> stringStream = list.stream().map(String::toLowerCase);
        List<Integer> numbersAdded = Stream.of(1, 2, 3, 4, 5).map(x -> x + 1).collect(Collectors.toList());
        System.out.println(numbersAdded);

        //Reduce
        String reduce = list.stream()
                .map(String::toUpperCase)
                .reduce("", (acc, e1) -> acc + "|" + e1);
        System.out.println("reduced: "+ reduce);

       Integer reduce1 = Stream.of(1, 2, 3, 4, 5)
                .reduce((acc, e1) -> acc + e1)
                .get();
        System.out.println("reduced1 : "+ reduce1);


        List<String> skipped = list.stream().skip(2).collect(Collectors.toList()); // skip Bohr and Darwin
        System.out.println("skipped:"+skipped);

        //Remove distincts
        Stream.of(1,0,0,1,1,0).distinct().forEach(System.out::println);

        //All Match
        boolean e = list.stream().allMatch(n -> n.contains("e"));

    }
}
