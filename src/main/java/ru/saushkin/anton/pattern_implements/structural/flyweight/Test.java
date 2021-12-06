package ru.saushkin.anton.pattern_implements.structural.flyweight;

public class Test {
    public static void main(String[] args) {
        // Фабрика легковесов
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight redFlyweight = factory.getFlyweight(RedFlyweight.class);
        Flyweight blueFlyweight = factory.getFlyweight(BlueFlyweight.class);
        Flyweight anyElseFlyweight = factory.getFlyweight(RedFlyweight.class);

        // Получение результата на основе легковеса и "абстрактного" внешнего состояния
        utilPrinter(redFlyweight.getResult("external condition"));
        utilPrinter(blueFlyweight.getResult("external condition"));
        utilPrinter(anyElseFlyweight.getResult("external condition"));
    }

    private static void utilPrinter(String string) {
        System.out.println(string);
    }
}
