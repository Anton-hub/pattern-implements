package ru.saushkin.anton.pattern_implements.creational.factory_method;

public class ConcreteCreator1 implements Creator{
    @Override
    public void someAction() {

    }

    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
