package ru.saushkin.anton.pattern_implements.creational.abstract_factory;

public class Test {
    public static void main(String[] args) {
        testFactory(new ConcreteFactory1());
        testFactory(new ConcreteFactory2());
    }

    private static void testFactory(AbstractFactory factory) {
        AbstractProductA aProduct = factory.createProductA();
        AbstractProductB bProduct = factory.createProductB();

        aProduct.printALabel();
        bProduct.printBLabel();
    }
}
