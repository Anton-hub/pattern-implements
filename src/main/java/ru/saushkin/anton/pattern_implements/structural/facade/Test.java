package ru.saushkin.anton.pattern_implements.structural.facade;

public class Test {
    public static void main(String[] args) {
        // Представляет простой интерфейс к сложной системе интерфейсов
        Facade facade = new FacadeImpl(
                new SomeDifficultInterfaceImpl(),
                new AnotherOneInterfaceImpl()
        );

        System.out.println(facade.getResult());
        System.out.println(facade.getAnythingResult());
    }
}
