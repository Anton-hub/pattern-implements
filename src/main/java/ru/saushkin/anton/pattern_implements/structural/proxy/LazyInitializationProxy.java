package ru.saushkin.anton.pattern_implements.structural.proxy;

public class LazyInitializationProxy implements DifficultInitializationType{

    private DifficultInitializationType difficultInitializationType;

    @Override
    public void operation() {
        if (difficultInitializationType == null) {
            difficultInitializationType = new DifficultInitializationTypeImpl();
        }
        difficultInitializationType.operation();
    }
}
