package ru.saushkin.anton.pattern_implements.creational.abstract_factory;

public class Test {
    public static void main(String[] args) {
        testFactory(new ConcreteFactory1());
        testFactory(new ConcreteFactory2());
    }

    private static void testFactory(AbstractFactory factory) {
        //Инициализация продуктов с помощью фабрики
        AbstractProductA aProduct = factory.createProductA();
        AbstractProductB bProduct = factory.createProductB();

        //Вызов метода конкретного продукта определенный в фабрике
        aProduct.printALabel();
        bProduct.printBLabel();
    }
}
