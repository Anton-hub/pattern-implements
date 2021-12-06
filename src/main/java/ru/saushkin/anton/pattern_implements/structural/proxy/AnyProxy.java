package ru.saushkin.anton.pattern_implements.structural.proxy;

public class AnyProxy implements DifficultInitializationType{
    DifficultInitializationType difficultInitializationType = new DifficultInitializationTypeImpl();

    @Override
    public void operation() {
        // Можно добавить новую логику тут
        difficultInitializationType.operation();
        // Или тут
        System.out.println("Do something else...");
    }
}
