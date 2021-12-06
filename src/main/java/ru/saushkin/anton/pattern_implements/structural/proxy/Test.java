package ru.saushkin.anton.pattern_implements.structural.proxy;

public class Test {
    public static void main(String[] args) {
        // На этапе инициализации прокси тяжелый объект не создается
        DifficultInitializationType proxy = new LazyInitializationProxy();

        // Создание объекта происходит только при первом вызове
        proxy.operation();

        // Также прокси может содержать доп. логику
        DifficultInitializationType addingLogicProxy = new AnyProxy();

        // Вызов DifficultInitializationTypeImpl::operation  доп. логикой
        addingLogicProxy.operation();
    }
}
