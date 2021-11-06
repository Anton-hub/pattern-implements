package ru.saushkin.anton.pattern_implements.creational.builder;

public class Test {
    public static void main(String[] args) {
        // определяет логику заполнения объекта
        Director director = new Director();

        // предоставляет методы для построения объекта
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();

        // создание разных продуктов с красным цветом
        director.constructRedProduct(concreteBuilder1);
        Product1 redProduct1 = concreteBuilder1.getResult();
        director.constructRedProduct(concreteBuilder2);
        Product2 redProduct2 = concreteBuilder2.getResult();

        // создание разных продуктов с синим цветом
        director.constructBlueProduct(concreteBuilder1);
        Product1 blueProduct1 = concreteBuilder1.getResult();
        director.constructBlueProduct(concreteBuilder2);
        Product2 blueProduct2 = concreteBuilder2.getResult();

        System.out.println(redProduct1);
        System.out.println(redProduct2);
        System.out.println(blueProduct1);
        System.out.println(blueProduct2);
    }
    /**
     * Таким образом любой продукт который можно построить с использованием интерфейса Builder
     * можно "заполнить" красным с помощью метода Director::constructRedProduct
     */
}
