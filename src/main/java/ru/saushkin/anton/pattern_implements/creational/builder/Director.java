package ru.saushkin.anton.pattern_implements.creational.builder;

public class Director {

    public void constructRedProduct(Builder builder) {
        builder.setPartA("Red");
        builder.setPartB("Red");
    }

    public void constructBlueProduct(Builder builder) {
        builder.setPartA("Blue");
        builder.setPartB("Blue");
    }

}
