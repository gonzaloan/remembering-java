package org.example.defaultmethod;

public interface PersonA {
    void walk();

    default void talk(){
        System.out.println("Hi!");
    }
}
