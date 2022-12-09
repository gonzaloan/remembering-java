package org.example.mapreduce;

import java.util.ArrayList;
import java.util.List;

public class MapReduce {
    public static void main(String args[]) {
        List<Employee> peoples = new ArrayList<>();
        peoples.add(new Employee(101, "Victor", 23));
        peoples.add(new Employee(102, "Rick", 21));
        peoples.add(new Employee(103, "Sam", 25));
        peoples.add(new Employee(104, "John", 27));
        peoples.add(new Employee(105, "Grover", 23));
        peoples.add(new Employee(106, "Adam", 22));
        peoples.add(new Employee(107, "Samy", 224));
        peoples.add(new Employee(108, "Duke", 29));
        double average = calculateAverage(peoples);
        System.out.println("Average age of employees are (classic way) : " + average);
        average = average(peoples);
        System.out.println("Average age of employees are (lambda way) : " + average);


    }

    private static double calculateAverage(List<? extends Employee> employees){
        int totalEmployee = employees.size();
        double sum = 0;
        for(Employee e : employees){
            sum += e.getAge();
        }
        return sum/totalEmployee;
    }

    private static double average(List<? extends Employee> people){
        return people.stream()
                .mapToInt(p -> p.getAge())
                .average()
                .getAsDouble();
    }
}
