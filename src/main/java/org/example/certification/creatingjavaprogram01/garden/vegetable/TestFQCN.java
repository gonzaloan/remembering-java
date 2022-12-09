package org.example.certification.creatingjavaprogram01.garden.vegetable;

import org.example.certification.creatingjavaprogram01.garden.vegetable.vine.VineVegetable;

/**
 * Testing ways to Import
 */
public class TestFQCN {


    public static void main(String[] args) {
        java.lang.String s = "We are testing ways to import classes";
        System.out.println(s);

        VineVegetable.main(args);
    }
}
