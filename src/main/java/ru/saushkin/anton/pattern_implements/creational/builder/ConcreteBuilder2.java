package ru.saushkin.anton.pattern_implements.creational.builder;

public class ConcreteBuilder2 implements Builder{

    private String aPart = "";
    private String bPart = "";

    @Override
    public void setPartA(String aPart) {
        this.aPart = aPart + " some logic";
    }

    @Override
    public void setPartB(String bPart) {
        this.bPart = bPart + " some logic";
    }

    public Product2 getResult() {
        return new Product2(aPart + " " + bPart);
    }
}
