package org.example.java8.lambda;

import java.util.concurrent.atomic.AtomicReference;

public class Scopes {
    private static double attribute1;
    private double attribute2;
    public double testLocalVariable(){
       AtomicReference<Double> n3 = new AtomicReference<>((double) 3);
        Operation op = (x,y) -> {
            n3.set(x + y);
            return n3.get();
        };

        return op.calculate(1,1);
    }

    public double testAttributesStaticVariables() {
        Operation op = (x,y) ->{
            attribute1 = x+y;
            attribute2 = attribute1;
            return attribute2;
        };
        return op.calculate(3,2);
    }
    public static void main(String[] args) {
        Scopes scopes = new Scopes();
        System.out.println(scopes.testLocalVariable());

        System.out.println(scopes.testAttributesStaticVariables());
    }
}
