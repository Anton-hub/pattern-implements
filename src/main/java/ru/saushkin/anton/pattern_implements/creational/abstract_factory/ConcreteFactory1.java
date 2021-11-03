package ru.saushkin.anton.pattern_implements.creational.abstract_factory;

public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new AbstractProductA() {
            @Override
            public void printALabel() {
                System.out.println("1 тип продукта А");
            }
        };
    }

    @Override
    public AbstractProductB createProductB() {
        return new AbstractProductB() {
            @Override
            public void printBLabel() {
                System.out.println("1 тип продукта B");
            }
        };
    }
}
