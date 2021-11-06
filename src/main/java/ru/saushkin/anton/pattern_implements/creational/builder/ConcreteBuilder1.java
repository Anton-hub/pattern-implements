package ru.saushkin.anton.pattern_implements.creational.builder;

public class ConcreteBuilder1 implements Builder{

    private String aPart = "";
    private String bPart = "";

    @Override
    public void setPartA(String aPart) {
        this.aPart = aPart;
    }

    @Override
    public void setPartB(String bPart) {
        this.bPart = bPart;
    }

    public Product1 getResult() {
        return new Product1(aPart, bPart);
    }
}
