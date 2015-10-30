package com.getInTheCloud.factoryPattern;

/**
 * Created by davicres on 30/10/2015.
 */
public class ProductFactory {
    Product createProduct(String type){
        if (type.equals("A"))
            return new ProductA();
        else
            return new ProductB();
    }

    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product prod = productFactory.createProduct("A");
        prod.writeName("David");
        prod = productFactory.createProduct("B");
        prod.writeName("David");
    }
}
