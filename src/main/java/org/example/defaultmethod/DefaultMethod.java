package org.example.defaultmethod;

public class DefaultMethod implements PersonA, PersonB {

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void talk() {
        PersonB.super.talk();
    }


    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.talk();
    }

}
