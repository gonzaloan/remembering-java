package org.example.defaultmethod;

public interface PersonB {
    default void talk(){
        System.out.println("Hi! I'm person B");
    }
}
