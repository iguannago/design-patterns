package com.getInTheCloud.factoryPattern;

/**
 * Created by davicres on 30/10/2015.
 */
public class ProductB extends Product {
    public void writeName(String name) {
        StringBuilder reverseName = new StringBuilder().append(name);
        System.out.println("My reverse name is: "+reverseName.reverse());
    }
}
