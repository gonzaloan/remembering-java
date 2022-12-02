package org.example.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {

    public void calculate() {
        Operation operation = (x, y) -> (x + y) / 2;
        System.out.println(operation.calculate(2, 3));

    }

    public void sort() {
        List<String> list = Arrays.asList("Gonzalo", "Emi", "Monochico");
        // Collections.sort(list, (String o1, String o2) -> o1.compareTo(o2));
        // Collections.sort(list, String::compareTo);
        list.sort(String::compareTo);
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        LambdaApp app = new LambdaApp();
        app.sort();
        app.calculate();
    }
}
