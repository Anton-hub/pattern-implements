package ru.saushkin.anton.pattern_implements.creational.factory_method;

public class Test {
    public static void main(String[] args) {
        //Создание конкретных продуктов через переопределенные фабричные методы
        Product product1 = testFactoryMethod(new ConcreteCreator1());
        Product product2 = testFactoryMethod(new ConcreteCreator2());

        product1.doAnything();
        product2.doAnything();
    }

    private static Product testFactoryMethod(Creator creator) {
        return creator.createProduct();
    }
}
