package ru.saushkin.anton.pattern_implements.structural.decorator;

public class Test {
    public static void main(String[] args) {
        // Декорируемый компонент не знает о примененных декорациях
        Component decoratedComponent = new AddingDecorator(
                new Base64Decorator(
                        new ConcreteComponent()));
        System.out.println(decoratedComponent.constructComponent());

        Component otherwiseDecoratedComponent = new AddingDecorator(
                new ConcreteComponent());
        System.out.println(otherwiseDecoratedComponent.constructComponent());
    }
}
