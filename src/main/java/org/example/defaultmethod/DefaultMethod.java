package org.example.defaultmethod;

public class DefaultMethod implements PersonA {

    @Override
    public void walk() {
        System.out.println("Walking...");
    }


    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.walk();
    }

}
